package sdo.md.service;

import java.util.ArrayList;

import org.springframework.web.multipart.MultipartFile;

public interface FileUploadService {
	String saveStore(MultipartFile file);
	boolean writeFile(MultipartFile file, String saveFileName);
	void saveStore(ArrayList<MultipartFile> files);
}
