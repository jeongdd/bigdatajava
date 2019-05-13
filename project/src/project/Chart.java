package project;

import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.DatasetRenderingOrder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.TextAnchor;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Paint;
//import java.awt.*;

public class Chart {
	public static void main(String[] args) {
		Chart bar = new Chart();
		JFreeChart chart = bar.getChart();
		ChartFrame f1 = new ChartFrame("Bar Chart", chart);
		f1.setSize(500,600);
		f1.setVisible(true);
		
	}
	public JFreeChart getChart() {
		
		//데이터 생성
		DefaultCategoryDataset data1 = new DefaultCategoryDataset(); //bar1
		DefaultCategoryDataset data2 = new DefaultCategoryDataset(); //bar2
		DefaultCategoryDataset data3 = new DefaultCategoryDataset(); //line
		
		//그래프 생성 bar1
		data1.addValue(1.0, "b1", "1월");
		data1.addValue(4.0, "b1", "2월");
		data1.addValue(3.0, "b1", "3월");
		data1.addValue(5.0, "b1", "4월");
		data1.addValue(5.0, "b1", "5월");
		data1.addValue(5.0, "b1", "6월");
		data1.addValue(7.0, "b1", "7월");
		data1.addValue(7.0, "b1", "8월");
		data1.addValue(8.0, "b1", "9월");
		data1.addValue(0, "b1", "10월");
		data1.addValue(0, "b1", "11월");
		data1.addValue(0, "b1", "12월");
		
		//그래프 생성 bar2
	
		data2.addValue(0, "b2", "1월");
		data2.addValue(0, "b2", "2월");
		data2.addValue(0, "b2", "3월");
		data2.addValue(0, "b2", "4월");
		data2.addValue(0, "b2", "5월");
		data2.addValue(0, "b2", "6월");
		data2.addValue(0, "b2", "7월");
		data2.addValue(0, "b2", "8월");
		data2.addValue(6.0, "b2", "9월");
		data2.addValue(0, "b2", "10월");
		data2.addValue(0, "b2", "11월");
		data2.addValue(0, "b2", "12월");
		
			
		//그래프 생성 bar3
		data3.addValue(9.0, "L1", "1월");
		data3.addValue(7.0, "L1", "2월");
		data3.addValue(2.0, "L1", "3월");
		data3.addValue(6.0, "L1", "4월");
		data3.addValue(6.0, "L1", "5월");
		data3.addValue(9.0, "L1", "6월");
		data3.addValue(5.0, "L1", "7월");
		data3.addValue(4.0, "L1", "8월");
		data3.addValue(8.0, "L1", "9월");
		data3.addValue(8.0, "L1", "10월");
		data3.addValue(8.0, "L1", "11월");
		data3.addValue(8.0, "L1", "12월");
		
		//렌더링 생성 및 세팅
		//렌더링 생성
		final BarRenderer renderer = new BarRenderer();
		final BarRenderer renderer2 = new BarRenderer();
		final LineAndShapeRenderer rendererL = new LineAndShapeRenderer();
		
		//공통 옵션 정의
		CategoryItemLabelGenerator generator = new StandardCategoryItemLabelGenerator();
		ItemLabelPosition p_center = new ItemLabelPosition(ItemLabelAnchor.CENTER, TextAnchor.CENTER);
		ItemLabelPosition p_below = new ItemLabelPosition(ItemLabelAnchor.OUTSIDE6, TextAnchor.TOP_LEFT);
		Font f = new Font("Console", Font.BOLD, 15);
		Font axisf = new Font("Console", Font.PLAIN, 15);
		
		//렌더링 세팅
		//그래프 1
		renderer.setBaseItemLabelGenerator(generator);
		renderer.setBaseItemLabelsVisible(true);
		renderer.setBasePositiveItemLabelPosition(p_center);
		renderer.setBaseItemLabelFont(f);
		
		renderer.setSeriesPaint(0, new Color(0,162,255));
		
		//그래프 2
		renderer2.setSeriesPaint(0, new Color(232,168,255));
		renderer2.setBaseItemLabelFont(f);
		renderer2.setBasePositiveItemLabelPosition(p_center);
		renderer2.setBaseItemLabelGenerator(generator);
		renderer2.setBaseItemLabelsVisible(true);
		
		//그래프 3
		rendererL.setBaseItemLabelGenerator(generator);
		rendererL.setBaseItemLabelsVisible(true);
		rendererL.setBaseShapesVisible(true);
		rendererL.setDrawOutlines(true);
		rendererL.setBaseItemLabelFont(f);
		rendererL.setUseFillPaint(true);
		rendererL.setBaseFillPaint(Color.WHITE);
		rendererL.setBasePositiveItemLabelPosition(p_below);
		rendererL.setSeriesPaint(0, new Color(219,121,22));
		rendererL.setSeriesStroke(0, new BasicStroke(
												2.0f,
												BasicStroke.CAP_ROUND,
												BasicStroke.JOIN_ROUND,
												3.0f)
		);
		
		//plot 생성
		CategoryPlot plot = new CategoryPlot();
		
		// plot에 데이터 적재
		plot.setDataset(data1);
		plot.setRenderer(renderer);
		plot.setDataset(1, data2);
		plot.setRenderer(1,renderer2);
		plot.setDataset(2,data3);
		plot.setRenderer(2,rendererL);
		
		// plot 기본 설정
		plot.setOrientation(PlotOrientation.VERTICAL);
		plot.setRangeGridlinesVisible(true);
		plot.setDomainGridlinesVisible(true);
		
		//랜더랑 순서 정의 : data 순서대로 렌더링 (먼저 등록한것이 아래로 깔리는것)
		plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
		
		// x축 세팅
		plot.setDomainAxis(new CategoryAxis());
		plot.getDomainAxis().setTickLabelFont(axisf);
		plot.getDomainAxis().setCategoryLabelPositions(CategoryLabelPositions.STANDARD);
		
		// y축 세팅
		
		plot.setRangeAxis(new NumberAxis());
		plot.getRangeAxis().setTickLabelFont(axisf);
		
		// 세팅된 plot을 바탕으로 chart생성
		final JFreeChart chart = new JFreeChart(plot);
		
		
		return chart;
	}
}


















