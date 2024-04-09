package cn.catarc.jsundials.sunlinsolband;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.LongByReference;
import java.util.Arrays;
import java.util.List;
/**
 * ---------------------------------------<br>
 * Band Implementation of SUNLinearSolver<br>
 * ---------------------------------------<br>
 * <i>native declaration : include\sunlinsol\sunlinsol_band.h:40</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class _SUNLinearSolverContent_Band extends Structure {
	/** C type : sunindextype */
	public long N;
	/** C type : sunindextype* */
	public LongByReference pivots;
	/** C type : sunindextype */
	public long last_flag;
	public _SUNLinearSolverContent_Band() {
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
	public _SUNLinearSolverContent_Band(long N, LongByReference pivots, long last_flag) {
		super();
		this.N = N;
		this.pivots = pivots;
		this.last_flag = last_flag;
	}
	public _SUNLinearSolverContent_Band(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends _SUNLinearSolverContent_Band implements Structure.ByReference {
		
	};
	public static class ByValue extends _SUNLinearSolverContent_Band implements Structure.ByValue {
		
	};
}