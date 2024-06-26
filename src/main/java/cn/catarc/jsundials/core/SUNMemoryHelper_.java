package cn.catarc.jsundials.core;
import cn.catarc.jsundials.core.Sundials_coreLibrary.SUNContext;
import cn.catarc.jsundials.core.Sundials_coreLibrary.SUNMemoryHelper_Ops;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : include\sundials\sundials_memory.h:41</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class SUNMemoryHelper_ extends Structure {
	/** C type : void* */
	public Pointer content;
	/** C type : SUNMemoryHelper_Ops */
	public SUNMemoryHelper_Ops ops;
	/** C type : SUNContext */
	public SUNContext sunctx;
	public SUNMemoryHelper_() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("content", "ops", "sunctx");
	}
	/**
	 * @param content C type : void*<br>
	 * @param ops C type : SUNMemoryHelper_Ops<br>
	 * @param sunctx C type : SUNContext
	 */
	public SUNMemoryHelper_(Pointer content, SUNMemoryHelper_Ops ops, SUNContext sunctx) {
		super();
		this.content = content;
		this.ops = ops;
		this.sunctx = sunctx;
	}
	public SUNMemoryHelper_(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends SUNMemoryHelper_ implements Structure.ByReference {
		
	};
	public static class ByValue extends SUNMemoryHelper_ implements Structure.ByValue {
		
	};
}
