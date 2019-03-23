import gobalkrishnanv.gobal1995.colorconvertor.CMYK_to_RGB;
import gobalkrishnanv.gobal1995.colorconvertor.HSL_to_RGB;
import gobalkrishnanv.gobal1995.colorconvertor.HSV_to_RGB;
import gobalkrishnanv.gobal1995.colorconvertor.RGB_to_CMYK;
import gobalkrishnanv.gobal1995.colorconvertor.RGB_to_HSL;
import gobalkrishnanv.gobal1995.colorconvertor.RGB_to_HSV;

public class ColorConvertorExample{

	public static void main(String[] args) {
		
		
		RGB_to_HSL hsl=new RGB_to_HSL();
		hsl.rgb(0,0,255);
		System.out.println(hsl);
		
		HSL_to_RGB hsl_rgb=new HSL_to_RGB();
		hsl_rgb.hsl(hsl.hue,hsl.saturation,hsl.light);
		System.out.println(hsl_rgb);
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		RGB_to_HSV hsv=new RGB_to_HSV();
		hsv.rgb(0,0,255);
		System.out.println(hsl);
		
		HSV_to_RGB hsv_rgb=new HSV_to_RGB();
		hsv_rgb.hsl(hsv.hue,hsv.saturation,hsv.value);
		System.out.println(hsv_rgb);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		RGB_to_CMYK r=new RGB_to_CMYK();
		r.rgb(0, 0, 255);
		System.out.println(r);
	   
		CMYK_to_RGB ra=new CMYK_to_RGB();
		ra.cmyk(r.cyan,r.magenta,r.yellow,r.black);
		System.out.println(ra);
		
		
		
		
	}


}
