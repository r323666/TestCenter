package com.sendori.testcenter.action;


import org.richfaces.event.FileUploadEvent;
import org.richfaces.model.UploadedFile;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ilya Shaikovsky
 */
@ManagedBean
@RequestScoped
public class FileUploadBean {
    private List<FileUploadEvent> files = new ArrayList<FileUploadEvent>();

    /*public void paint(OutputStream stream, Object object) throws IOException {
        stream.write(getFiles().get((Integer) object).getData());
        stream.close();
    }*/

    public void listener(FileUploadEvent event) throws Exception {

        UploadedFile file = event.getUploadedFile();
        System.out.println("ramki................");
        //UploadedImage file = new UploadedImage();
        //File file1 = file.
        //InputStream in=file1
        /*byte[] buf = new byte[1024];
        int len;
        while ((len = file.read(buf)) > 0) {
            System.out.print(in);
        }
        in.close();*/
    }

    public String clearUploadData() {
        files.clear();
        return null;
    }

    public int getSize() {
        if (getFiles().size() > 0) {
            return getFiles().size();
        } else {
            return 0;
        }
    }

    public long getTimeStamp() {
        return System.currentTimeMillis();
    }

    public List<FileUploadEvent> getFiles() {
        return files;
    }

    public void setFiles(ArrayList<FileUploadEvent> files) {
        this.files = files;
    }
}