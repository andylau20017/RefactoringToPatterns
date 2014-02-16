//优点：
// 比构造函数能更好的表达所创建实例的种类
//  避免构造函数的局限，比如两个构造函数参数数目和类型不能相同
// 更容易发现无用的创建代码
// 缺点：
// 创建方式是非标准的：有些类用new实例化，而有些用Create Method实例化

public class Loan {
	public Loan(double notional, int customerRating, Date maturity) {
		this(notional, 0.00, customerRating, maturity, null);
	}
	
	public Loan(double notional, int customerRating, Date maturity, Date expiry) {
		this(notional, 0.00, customerRating, maturity, expiry);
	}
	
	public Loan(double notional, double outstanding, int customerRating, Date maturity,
	Date expiry) {
		this(null, notional, outstanding, customerRating, maturity, expiry);
	}
	
	public Loan(CapitalStrategy capitalStrategy, double notional, int customerRating,
	Date maturity, Date expiry) {
		this(capitalStrategy, notional, 0.00, customerRating, maturity, expiry);
	}
	
	public Loan(CapitalStrategy capitalStrategy, double notional, double outstanding,
		int customerRating, Date maturity, Date expiry) {
		this.notional = notional;
		this.outstanding = outstanding;
		this.customerRating = customerRating;
		this.maturity = maturity;
		this.expiry = expiry;
		this.capitalStrategy = capitalStrategy;
		if (capitalStrategy == null) {
		if (expiry == null)
		this.capitalStrategy = new TermCapitalStrategy();
		else if (maturity == null)
		this.capitalStrategy = new RevolverCapitalStrategy();
		else
		this.capitalStrategy = new RCTLCapitalStrategy();
	}
}