/*
Copyright (c) Microsoft Corporation
All rights reserved. 
MIT License

Permission is hereby granted, free of charge, to any person obtaining a copy of this 
software and associated documentation files (the "Software"), to deal in the Software 
without restriction, including without limitation the rights to use, copy, modify, merge, 
publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons 
to whom the Software is furnished to do so, subject to the following conditions:
The above copyright notice and this permission notice shall be included in all copies or 
substantial portions of the Software.
THE SOFTWARE IS PROVIDED *AS IS*, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, 
INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR 
PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE 
FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, 
ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.microsoft.cognitive_services.speech_recognition.examples;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Paths;

public class SimpleExample {

  public static void main(String[] args) throws Exception {
	 String key = "32f30e6c54304678abb9fa19262e2735";
   /* if (args.length < 2) {
      System.out.println("Usage: SimpleExample <subscription key> <file to transcribe>.");
      return;
    }
*/
    //String key = args[0];
    String filepath = "E:\\hacktech\\soundtrain\\boo1.wav";

    SpeechClientREST client = new SpeechClientREST(new Authentication(key));

    InputStream input = new FileInputStream(Paths.get(filepath).toFile());
    System.out.println(client.process(input));
  }
}
