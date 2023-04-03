package com.lansmancai.laneditor.handler.save;

import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;

import com.lansmancai.laneditor.EditorFrame;
import com.lansmancai.laneditor.config.CompileConfig;
import com.lansmancai.laneditor.util.CommandUtil;

/**
 * 保存Java文件的处理类
 * 
 */
public class JavaSaveHandler extends CommonSaveHandler {

	
	
	public String save(EditorFrame editorFrame) {
		//调用父类的保存方法
		super.save(editorFrame);
		return javac(editorFrame);
	}

	//执行javac命令
	private String javac(EditorFrame editorFrame) {
		try {
			//获得项目的编译路径，项目目录加CompileConfig中配置的输出目录
			String classPath = editorFrame.getCurrentProject().getAbsolutePath() 
				+ File.separator + CompileConfig.OUTPUT_DIR;
			//获得源文件的文件路径
			String filePath = editorFrame.getCurrentFile().getFile().getAbsolutePath();
			//拼装字符串命令，该命令只可在windows下运行
			String command = "javac -d \"" + classPath + "\" \"" + filePath + "\"";
			System.out.println(command);
			Process p = CommandUtil.executeCommand(command);
			return CommandUtil.getProcessString(p);
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	

}
