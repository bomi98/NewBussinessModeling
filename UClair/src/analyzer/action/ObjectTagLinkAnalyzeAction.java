package analyzer.action;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.Action;

import analyzer.Analyzer;

public class ObjectTagLinkAnalyzeAction extends AbstractCommonAction implements PropertyChangeListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public ObjectTagLinkAnalyzeAction(Analyzer alayzer) {
		super(alayzer);
		setEnabled(true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ObjectTagLinkAnalyzeAction");
	}


	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		
	}

}
