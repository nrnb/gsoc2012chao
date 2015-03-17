/*******************************************************************************
 * Copyright 2010 Alexander Pico
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.nrnb.noa.utils.download;

import org.nrnb.noa.utils.download.Status;
import java.net.URL;

/**
 * clsss to store the details of the file to be downloaded
 * @author Anurag Sharma
 */
public class DownloadEvent {

    public String ID;
    public URL url;
    public Status status;
}
