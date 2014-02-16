/**
 * 
 */
package com.amazon.ipcsop.design_pattern.strategy.refactory;

/**
 * @author erfeiliu
 *
 */
public class GenerateForecastSummaryReport {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prospects ps = new RedisProspects();
		ForecastSummaryScheduler fs = new ForecastSummaryScheduler(ps);
		fs.pullWeeklyForecast();
		fs.pullDailyForecast();
	}

}
