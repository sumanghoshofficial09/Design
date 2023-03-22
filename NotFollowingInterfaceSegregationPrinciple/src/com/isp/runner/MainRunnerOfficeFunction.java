package com.isp.runner;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.InputMapUIResource;
import javax.swing.plaf.multi.MultiButtonUI;

import com.isp.pojo.CannonPrinter;
import com.isp.pojo.HpPrinterScanner;
import com.isp.pojo.IMultiFunction;
import com.isp.pojo.XeroxWorkCentre;

public class MainRunnerOfficeFunction {
	
	public static void main(String args[])
	{
		IMultiFunction item1 = new XeroxWorkCentre();
		IMultiFunction item2 = new HpPrinterScanner();
		IMultiFunction item3 = new CannonPrinter();
		
		List<IMultiFunction>  multiFunctionList = new ArrayList<IMultiFunction>();
		
		multiFunctionList.add(item1);
		multiFunctionList.add(item2);
		multiFunctionList.add(item3);
		
		for(IMultiFunction multiFunction : multiFunctionList)
		{
			
			System.out.println("printing job ");
			multiFunction.print();
			
			System.out.println("scanning job ");
			multiFunction.scan();
			
			System.out.println("faxing job ");
			multiFunction.fax();
			
			
		}
	}

}
