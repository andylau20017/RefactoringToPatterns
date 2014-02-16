/**
 * 
 */
package com.amazon.ipcsop.design_pattern.strategy.refactory;

/**
 * @author erfeiliu
 *
 */
public class ForecastSummaryScheduler {
	private Prospects ps;
	
	public ForecastSummaryScheduler(Prospects ps){
		this.ps = ps;
	}
	
	public void pullWeeklyForecast(){
		String prospectTotalsResults = ps.getProspectTotals();
		System.out.println("pull weekly forecast data!");
	}
	
	public void pullDailyForecast(){
		String prospectTotalsResults = ps.getProspectTotals();
		System.out.println("pull daily forecast data!");
	}
	

}
