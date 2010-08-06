/*
 *  Copyright 2010 Elmer Garduno
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package net.elmergarduno.jcalais;

import java.io.IOException;
import java.io.Reader;
import java.net.URL;

public interface CalaisClient {
  
  CalaisResponse analyze(URL url) throws IOException;
  
  CalaisResponse analyze(URL url, CalaisConfig config)
    throws IOException;

  CalaisResponse analyze(Reader reader) throws IOException;

  CalaisResponse analyze(Reader reader, CalaisConfig config)
    throws IOException;

  CalaisResponse analyze(String content) throws IOException;

  CalaisResponse analyze(String content, CalaisConfig config) 
    throws IOException;

}