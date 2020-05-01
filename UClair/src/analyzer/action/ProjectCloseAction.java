package analyzer.action;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import analyzer.Analyzer;

public class ProjectCloseAction extends AbstractCommonAction implements PropertyChangeListener {

	private static final long serialVersionUID = 1L;

	public ProjectCloseAction(Analyzer analyzer) {
		super(analyzer);
		setEnabled(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("ProjectCloseAction 수행");
		getAnalyzer().closeProject();
		System.out.println("ProjectCloseAction 오류 없음");
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub

	}

}
