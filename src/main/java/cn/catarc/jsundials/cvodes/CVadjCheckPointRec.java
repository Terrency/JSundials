package cn.catarc.jsundials.cvodes;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : include\cvodes\cvodes.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CVadjCheckPointRec extends Structure {
	/** C type : void* */
	public Pointer my_addr;
	/** C type : void* */
	public Pointer next_addr;
	/** C type : sunrealtype */
	public double t0;
	/** C type : sunrealtype */
	public double t1;
	public long nstep;
	public int order;
	/** C type : sunrealtype */
	public double step;
	public CVadjCheckPointRec() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("my_addr", "next_addr", "t0", "t1", "nstep", "order", "step");
	}
	/**
	 * @param my_addr C type : void*<br>
	 * @param next_addr C type : void*<br>
	 * @param t0 C type : sunrealtype<br>
	 * @param t1 C type : sunrealtype<br>
	 * @param step C type : sunrealtype
	 */
	public CVadjCheckPointRec(Pointer my_addr, Pointer next_addr, double t0, double t1, long nstep, int order, double step) {
		super();
		this.my_addr = my_addr;
		this.next_addr = next_addr;
		this.t0 = t0;
		this.t1 = t1;
		this.nstep = nstep;
		this.order = order;
		this.step = step;
	}
	public CVadjCheckPointRec(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends CVadjCheckPointRec implements Structure.ByReference {
		
	};
	public static class ByValue extends CVadjCheckPointRec implements Structure.ByValue {
		
	};
}
