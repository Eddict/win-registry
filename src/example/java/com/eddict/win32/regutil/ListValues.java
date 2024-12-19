package com.eddict.win32.regutil;

import java.util.List;
import java.util.Map;

import com.github.eddict.winreg.HKey;
import com.github.eddict.winreg.RegistryException;
import com.github.eddict.winreg.WindowsRegistry;



/**
 * @author Cyril MICOUD (ToBeKedge)
 */
public class ListValues {

	public static void main(String[] args) throws RegistryException {
		WindowsRegistry reg = WindowsRegistry.getInstance();
		String branch = "Software\\Microsoft\\Windows NT\\CurrentVersion\\Devices";
		Map<String, String> values = reg.readStringValues(HKey.HKCU, branch);
		for (Map.Entry<String, String> value : values.entrySet()) {
			System.out.println(value.getKey() + ": " + value.getValue());
		}
	}
}
