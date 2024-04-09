package cn.catarc.jsundials;

import cn.catarc.jsundials.SundialsSunmatrixdenseLibrary.sunindextype;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.PointerByReference;

import java.util.Arrays;
import java.util.List;
/**
 * ----------------------------------------<br>
 * Dense Implementation of SUNLinearSolver<br>
 * ----------------------------------------<br>
 * <i>native declaration : include\sunlinsol\sunlinsol_dense.h:10</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class _SUNLinearSolverContent_Dense extends Structure {
	/** C type : sunindextype */
	public sunindextype N;
	/** C type : sunindextype* */
	public PointerByReference pivots;
	/** C type : sunindextype */
	public sunindextype last_flag;
	public _SUNLinearSolverContent_Dense() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("N", "pivots", "last_flag");
	}
	/**
	 * @param N C type : sunindextype<br>
	 * @param pivots C type : sunindextype*<br>
	 * @param last_flag C type : sunindextype
	 */
	public _SUNLinearSolverContent_Dense(sunindextype N, PointerByReference pivots, sunindextype last_flag) {
		super();
		this.N = N;
		this.pivots = pivots;
		this.last_flag = last_flag;
	}
	public _SUNLinearSolverContent_Dense(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends _SUNLinearSolverContent_Dense implements Structure.ByReference {
		
	};
	public static class ByValue extends _SUNLinearSolverContent_Dense implements Structure.ByValue {
		
	};
}
