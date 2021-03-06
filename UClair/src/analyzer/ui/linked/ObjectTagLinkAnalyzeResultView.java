package analyzer.ui.linked;

import javax.swing.JComponent;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JScrollPane;
import java.awt.GridBagConstraints;
import java.util.List;

import javax.swing.JTable;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;

import com.jidesoft.document.DocumentComponent;
import com.jidesoft.document.DocumentPane;

import analyzer.analysis.linked.ObjectTagLinkResult;
import analyzer.frame.AnalyzerMainFrame;
import analyzer.ui.physical.PhysicalTagDependAnalyzeResultTableModel;

/**
 *
 * <pre>
 * NAME   : com.naru.uclair.analyzer.ui.linked.ObjectTagLinkAnalyzeResultView.java
 * DESC   : 객체 태그 연결 분석 결과 표시 View.
 *
 * references : 설계서 NARU-XXX-XXX-XXX
 *
 * Copyright 2012 NARU Technology All rights reserved
 * <pre>
 *
 * @author US Laboratory naruteclab4
 * @since 2012. 6. 21.
 * @version 1.0
 *
 */
public class ObjectTagLinkAnalyzeResultView extends JPanel {

	/**
	 * 객체 직렬화 버전 아이디.
	 */
	private static final long serialVersionUID = 1L;
	private JTable resultTable;

	ObjectTagLinkAnalyzeResultTableModel tableModel = null;
	private static DocumentPane _workspacePane =  AnalyzerMainFrame._workspacePane;		

	/**
	 * Create the panel.
	 */
	public ObjectTagLinkAnalyzeResultView() {
//		initializeUi();
		final DocumentComponent document = new DocumentComponent(initializeUi(), "객체태그 연결정보 분석");
		_workspacePane.openDocument(document);
	}
	
	private JComponent initializeUi() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JScrollPane resultTableScrollPane = new JScrollPane();
		GridBagConstraints gbc_resultTableScrollPane = new GridBagConstraints();
		gbc_resultTableScrollPane.fill = GridBagConstraints.BOTH;
		gbc_resultTableScrollPane.gridx = 0;
		gbc_resultTableScrollPane.gridy = 0;
		add(resultTableScrollPane, gbc_resultTableScrollPane);
		
		tableModel = new ObjectTagLinkAnalyzeResultTableModel();
		
		resultTable = new JTable(tableModel);
		TableRowSorter<ObjectTagLinkAnalyzeResultTableModel> tableRowSorter = 
			new TableRowSorter<ObjectTagLinkAnalyzeResultTableModel>(tableModel);
		resultTable.setRowSorter(tableRowSorter);
		resultTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		TableColumn column = resultTable.getColumnModel().getColumn(0);
		column.setPreferredWidth(150);
		
		column = resultTable.getColumnModel().getColumn(1);
		column.setPreferredWidth(80);
		
		for(int index = 2; index < tableModel.getColumnCount(); index++) {
			column = resultTable.getColumnModel().getColumn(index);
			column.setPreferredWidth(250);
		}
		
		resultTableScrollPane.setViewportView(resultTable);
		
		return resultTableScrollPane;
	}
	
	/**
	 * 
	 * 분석 결과를 화면에 표시하기 윈한 정보를 설정한다.<br/>
	 * - 메소드의 처리 절차 기술.
	 * 
	 * @param resultList 분석 결과.
	 */
	public void setAnalyzeResult(List<ObjectTagLinkResult> resultList) {
		tableModel.setAnalyzeResult(resultList);
	}

}
