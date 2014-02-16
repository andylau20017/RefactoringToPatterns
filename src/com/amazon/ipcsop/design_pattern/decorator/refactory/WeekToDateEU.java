/**
 * 
 */
package com.amazon.ipcsop.design_pattern.decorator.refactory;

/**
 * @author erfeiliu
 *
 */
public class WeekToDateEU extends WeekToDate {
	private WeekToDate wtd;

	public void setWeekToDate(WeekToDate wtd){
		this.wtd = wtd;
	}
	
	/* (non-Javadoc)
	 * @see com.amazon.ipcsop.design_pattern.decorator.refactory.WeekToDate#SummaryTable()
	 */
	@Override
	public void SummaryTable() {
		// TODO Auto-generated method stub
		wtd.SummaryTable();
		ShowSTR1();
	}
	
	private void ShowSTR1() {
		// Handle STR1 Case
		// 
		System.out.println("Show STR1 in Summary Table!");
	}

}
