package gui;

import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import employee.EmployeeInput;
import java_project.EmployeeManager;

public class EmployeeViewer extends JPanel{

	WindowFrame frame;
	
	EmployeeManager employeeManager;
	
	public EmployeeViewer(WindowFrame frame,EmployeeManager employeeManager) {
		this.frame = frame;
		this.employeeManager = employeeManager;
		
		
		System.out.println("***" + employeeManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Id");
		model.addColumn("Name");
		model.addColumn("Email");
		model.addColumn("Contact Info");
		
		for(int i=0; i< employeeManager.size(); i++) {
			Vector row = new Vector();
			EmployeeInput si = employeeManager.get(i);
			row.add(si.getId());
			row.add(si.getName());
			row.add(si.getEmail());
			row.add(si.getPhoneNumber());
			model.addRow(row);
		}
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);

	}

}
