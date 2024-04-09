package cn.catarc.jsundials;

import cn.catarc.jsundials.LibSundials_coreDllLibrary.SUNContext;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;
/**
 * A vector is a structure with an implementation-dependent<br>
 * 'content' field, and a pointer to a structure of vector<br>
 * operations corresponding to that implementation.<br>
 * <i>native declaration : include\sundials\sundials_nvector.h:144</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class _generic_N_Vector extends Structure {
	/** C type : void* */
	public Pointer content;
	/** C type : N_Vector_Ops */
	public _generic_N_Vector_Ops.ByReference ops;
	/** C type : SUNContext */
	public SUNContext sunctx;
	public _generic_N_Vector() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("content", "ops", "sunctx");
	}
	/**
	 * @param content C type : void*<br>
	 * @param ops C type : N_Vector_Ops<br>
	 * @param sunctx C type : SUNContext
	 */
	public _generic_N_Vector(Pointer content, _generic_N_Vector_Ops.ByReference ops, SUNContext sunctx) {
		super();
		this.content = content;
		this.ops = ops;
		this.sunctx = sunctx;
	}
	public _generic_N_Vector(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends _generic_N_Vector implements Structure.ByReference {
		
	};
	public static class ByValue extends _generic_N_Vector implements Structure.ByValue {
		
	};
}