package analyzer.action;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.Action;

import analyzer.Analyzer;

public class IOTestSheetExportAction extends AbstractCommonAction implements PropertyChangeListener {

	public IOTestSheetExportAction(Analyzer alayzer) {
		super(alayzer);
		setEnabled(true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("IOTestSheetExportAction");
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		
	}

}
