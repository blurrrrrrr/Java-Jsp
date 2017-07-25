package Line;

import java.awt.Color;
import java.awt.Font;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class gas {
	public static void main(String[] args) {
		StandardChartTheme mChartTheme = new StandardChartTheme("CN");
		mChartTheme.setLargeFont(new Font("����", Font.BOLD, 20));
		mChartTheme.setExtraLargeFont(new Font("����", Font.PLAIN, 15));
		mChartTheme.setRegularFont(new Font("����", Font.PLAIN, 15));
		ChartFactory.setChartTheme(mChartTheme);
		
		CategoryDataset mDataset = GetDataset();
		
		JFreeChart mChart = ChartFactory.createLineChart(
				"2016����ʵ���ɼ���������",
				"�ɼ�ʱ��",
				"����",
				mDataset,
				PlotOrientation.VERTICAL,//vertical
				true, 
				true, 
				false);
		
		CategoryPlot mPlot = (CategoryPlot)mChart.getPlot();
		mPlot.setBackgroundPaint(Color.LIGHT_GRAY);
		mPlot.setRangeGridlinePaint(Color.BLUE);//�����ײ�������
		mPlot.setOutlinePaint(Color.RED);//�߽���
		
		ChartFrame mChartFrame = new ChartFrame("XZQ", mChart);
		mChartFrame.pack();
		mChartFrame.setVisible(true);

	}
	public static CategoryDataset GetDataset()
	{
		DefaultCategoryDataset mDataset = new DefaultCategoryDataset();
		mDataset.addValue(0.5, "A����", "05:52:33");
		mDataset.addValue(0.8, "A����", "18:13:54");
		mDataset.addValue(0.4, "A����", "18:10:56");
		mDataset.addValue(0.25, "A����", "19:14:06");
		mDataset.addValue(0.42, "A����", "19:12:45");
		mDataset.addValue(0.1, "A����", "19:15:07");
		
		mDataset.addValue(0.24, "B����", "05:52:33");
		mDataset.addValue(1, "B����", "18:13:54");
		mDataset.addValue(0.9, "B����", "18:10:56");
		mDataset.addValue(0.3,  "B����", "19:14:06");
		mDataset.addValue(0.2,  "B����", "19:12:45");
		mDataset.addValue(0.35,  "B����", "19:15:07");
		return mDataset;
	}


}