//�ŵ㣺
// �ȹ��캯���ܸ��õı��������ʵ��������
//  ���⹹�캯���ľ��ޣ������������캯��������Ŀ�����Ͳ�����ͬ
// �����׷������õĴ�������
// ȱ�㣺
// ������ʽ�ǷǱ�׼�ģ���Щ����newʵ����������Щ��Create Methodʵ����

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