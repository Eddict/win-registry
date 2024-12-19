package com.eddict.win32.regutil;

import java.util.List;

import com.github.eddict.winreg.HKey;
import com.github.eddict.winreg.RegistryException;
import com.github.eddict.winreg.WindowsRegistry;



/**
 * @author Bartosz Firyn (SarXos)
 */
public class ListKeys {

	public static void main(String[] args) throws RegistryException {
		WindowsRegistry reg = WindowsRegistry.getInstance();
		String branch = "SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion\\Network";
		List<String> keys = reg.readStringSubKeys(HKey.HKLM, branch);
		for (String key : keys) {
			System.out.println(key);
		}
	}
}
