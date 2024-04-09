package cn.catarc.jsundials;

import cn.catarc.jsundials.SundialsSunmatrixdenseLibrary.sunindextype;
import cn.catarc.jsundials.SundialsSunmatrixdenseLibrary.sunrealtype;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;
/**
 * -----------------------------------------------------------------<br>
 * SERIAL implementation of N_Vector<br>
 * -----------------------------------------------------------------<br>
 * <i>native declaration : include\nvector\nvector_serial.h:12</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class _N_VectorContent_Serial extends Structure {
	/**
	 * vector length<br>
	 * C type : sunindextype
	 */
	public sunindextype length;
	/**
	 * data ownership flag<br>
	 * C type : sunbooleantype
	 */
	public int own_data;
	/**
	 * data array<br>
	 * C type : sunrealtype*
	 */
	public sunrealtype data;
	public _N_VectorContent_Serial() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("length", "own_data", "data");
	}
	/**
	 * @param length vector length<br>
	 * C type : sunindextype<br>
	 * @param own_data data ownership flag<br>
	 * C type : sunbooleantype<br>
	 * @param data data array<br>
	 * C type : sunrealtype*
	 */
	public _N_VectorContent_Serial(sunindextype length, int own_data, sunrealtype data) {
		super();
		this.length = length;
		this.own_data = own_data;
		this.data = data;
	}
	public _N_VectorContent_Serial(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends _N_VectorContent_Serial implements Structure.ByReference {
		
	};
	public static class ByValue extends _N_VectorContent_Serial implements Structure.ByValue {
		
	};
}
