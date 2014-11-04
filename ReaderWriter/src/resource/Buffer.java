package resource;

import java.util.Random;

import com.lac.annotations.Resource;

@Resource
public class Buffer {
	int size = 7;
	String[] buff = new String[size];
	int writeIndex = 0;
	int readIndex = 0;
	
	public void escribir(){
		String value = Integer.toString((new Random()).nextInt(10000));
		System.out.println("writeIndex: " + writeIndex + " written value: "+ value + " Thread id: " + Thread.currentThread().getId());
		buff[writeIndex] = value ;
		if(writeIndex == size -1 )
			writeIndex = 0;
		else
			writeIndex++;
	}
	
	public void leer(){
		String value = buff[readIndex];
		buff[readIndex] = null;
		System.out.println("readIndex = "+ readIndex + " written value: "+ value + " Thread id: " + Thread.currentThread().getId() );
		if(readIndex == size -1 )
			readIndex = 0;
		else
			readIndex++;
	}
	
}
