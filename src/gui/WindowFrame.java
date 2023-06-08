package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java_project.EmployeeManager;

public class WindowFrame extends JFrame{
	
	EmployeeManager employeeManager;
	
	MenuSelection menuselection;
	EmployeeAdder employeeadder;
	EmployeeViewer employeeviewer;

	

	public WindowFrame(EmployeeManager employeeManager) {
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setTitle("My Frame");
		
		this.employeeManager = employeeManager;
		this.menuselection = new MenuSelection(this);
		this.employeeadder = new EmployeeAdder(this);
		this.employeeviewer = new EmployeeViewer(this, this.employeeManager);
	
		this.setupPanel(menuselection);
	}
	


	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();  
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public EmployeeAdder getEmployeeadder() {
		return employeeadder;
	}

	public void setEmployeeadder(EmployeeAdder employeeadder) {
		this.employeeadder = employeeadder;
	}

	public EmployeeViewer getEmployeeviewer() {
		return employeeviewer;
	}

	public void setEmployeeviewer(EmployeeViewer employeeviewer) {
		this.employeeviewer = employeeviewer;
	}
	
}
