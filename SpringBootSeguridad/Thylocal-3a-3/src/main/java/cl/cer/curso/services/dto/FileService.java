package cl.cer.curso.services.dto;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;

import org.springframework.core.io.Resource;

public interface FileService {

	
	
	
	Path getBasePath();
	
	
	Resource laodFileAsResource(Path filePath) throws FileNotFoundException;
	
	FileList getFilesInfo(Path filePath) throws IOException; 
	
	
	void saveFile(Path filePath, InputStream inputStream ) throws IOException;
 	
	void delete(Path filePath) throws IOException;
	
	void createDirectory(Path filePath) throws IOException;
	
	
}
