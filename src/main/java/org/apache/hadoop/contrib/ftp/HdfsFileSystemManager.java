package org.apache.hadoop.contrib.ftp;

import org.apache.ftpserver.ftplet.FileSystemFactory;
import org.apache.ftpserver.ftplet.FileSystemView;
import org.apache.ftpserver.ftplet.FtpException;
import org.apache.ftpserver.ftplet.User;

/**
 * Impelented FileSystemManager to use HdfsFileSystemView
 */
public class HdfsFileSystemManager implements FileSystemFactory {
	public FileSystemView createFileSystemView(User user) throws FtpException {
		return new HdfsFileSystemView(user);
	}
}
