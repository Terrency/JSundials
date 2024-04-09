package cn.catarc.jsundials.arkode;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.DoubleByReference;

import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : include\arkode\arkode_sprk.h:25</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class ARKodeSPRKTableMem extends Structure {
	public int q;
	public int stages;
	/** C type : sunrealtype* */
	public DoubleByReference a;
	/** C type : sunrealtype* */
	public DoubleByReference ahat;
	public ARKodeSPRKTableMem() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("q", "stages", "a", "ahat");
	}
	/**
	 * @param a C type : sunrealtype*<br>
	 * @param ahat C type : sunrealtype*
	 */
	public ARKodeSPRKTableMem(int q, int stages, DoubleByReference a, DoubleByReference ahat) {
		super();
		this.q = q;
		this.stages = stages;
		this.a = a;
		this.ahat = ahat;
	}
	public ARKodeSPRKTableMem(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends ARKodeSPRKTableMem implements Structure.ByReference {
		
	};
	public static class ByValue extends ARKodeSPRKTableMem implements Structure.ByValue {
		
	};
}