package cn.catarc.jsundials;

import cn.catarc.jsundials.SundialsSunmatrixdenseLibrary.sunindextype;
import cn.catarc.jsundials.SundialsSunmatrixdenseLibrary.sunrealtype;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;
/**
 * ----------------------------------<br>
 * Dense implementation of SUNMatrix<br>
 * ----------------------------------<br>
 * <i>native declaration : include\sunmatrix\sunmatrix_dense.h:10</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class _SUNMatrixContent_Dense extends Structure {
	/** C type : sunindextype */
	public sunindextype M;
	/** C type : sunindextype */
	public sunindextype N;
	/** C type : sunrealtype* */
	public sunrealtype data;
	/** C type : sunindextype */
	public sunindextype ldata;
	/** C type : sunrealtype** */
	public sunrealtype[] cols;
	public _SUNMatrixContent_Dense() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("M", "N", "data", "ldata", "cols");
	}
	/**
	 * @param M C type : sunindextype<br>
	 * @param N C type : sunindextype<br>
	 * @param data C type : sunrealtype*<br>
	 * @param ldata C type : sunindextype<br>
	 * @param cols C type : sunrealtype**
	 */
	public _SUNMatrixContent_Dense(sunindextype M, sunindextype N, sunrealtype data, sunindextype ldata, sunrealtype cols[]) {
		super();
		this.M = M;
		this.N = N;
		this.data = data;
		this.ldata = ldata;
		if ((cols.length != this.cols.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.cols = cols;
	}
	public _SUNMatrixContent_Dense(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends _SUNMatrixContent_Dense implements Structure.ByReference {
		
	};
	public static class ByValue extends _SUNMatrixContent_Dense implements Structure.ByValue {
		
	};
}
