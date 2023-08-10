package net.hibiznet.app.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FileDownloadController {

	private static final Logger logger = LoggerFactory.getLogger(FileDownloadController.class);

    // ���� �ٿ�ε� ������ �̵�
    @RequestMapping("download/fileDownloadListView")
    public ModelAndView fileDownloadList() {
        ModelAndView mv = new ModelAndView();
        // ������ �ִ� ��ü ���� ��� ��������
        File path = new File("D:/DevelopeWEB/FILE_FOLDER");
        String[] fileList = path.list();

        mv.addObject("fileList", fileList);
        mv.setViewName("fileDownloadListView");
        return mv;
    }
    // ���� �ٿ�ε� ó��
    @RequestMapping("/fileDownload/{file}")
    public void fileDownload(@PathVariable String file,
                             HttpServletResponse response) throws IOException {
    	logger.debug(">>> fileDownload::file " + file + " <<<");
    	String fileName = file + ".xlsx";
    	File f = new File("D:/DevelopeWEB/FILE_FOLDER", fileName);
        // file �ٿ�ε� ����
        //response.setContentType("application/download");
    	//response.setContentType("application/vnd.ms-excel");
    	//response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;charset=UTF-8");
    	//response.setContentType("application/x-msdownload");
        //response.setContentLength((int)f.length());
        //response.setHeader("Content-disposition", "attachment;filename=\"" + new String(fileName.getBytes(), "UTF-8"));
        // response ��ü�� ���ؼ� �����κ��� ���� �ٿ�ε�
        OutputStream os = response.getOutputStream();
        // ���� �Է� ��ü ����
        FileInputStream fis = new FileInputStream(f);
        FileCopyUtils.copy(fis, os);
        fis.close();
        os.close();
    }
}
