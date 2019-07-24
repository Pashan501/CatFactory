package pasha.anno2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;





/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Cat cat1 = new Cat();
        Cat2 cat2 = new Cat2();
        
        Class clazz1  = cat1.getClass();
        Class clazz2  = cat2.getClass();
        
        
        Annotation[] ann = clazz1.getAnnotations();
        
        for(Annotation a : ann) 
		{
			if(a instanceof Blohable) 
			{
				Blohable bloha = (Blohable) a;
				
				String nameBlohablet1 = bloha.name();
				System.out.println(nameBlohablet1);
			}
		}
        

        ann = clazz2.getAnnotations();
        
        for(Annotation a : ann) 
		{
			if(a instanceof Blohable) 
			{
				Blohable bloha = (Blohable) a;
				
				String nameBlohablet2 = bloha.name();
				System.out.println(nameBlohablet2);
			}
		}
        try {
			
			
			Method methodSet = clazz1.getMethod("setIsSick", String.class);
			methodSet.invoke(cat1, true);
			Method methodGet = clazz1.getMethod("getIsSick");
			String result1 = (String)methodGet.invoke(cat1); 
			System.out.println(result1);
    }catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
}
}