package com.spring.ioc.resource;

import org.junit.Test;
import org.springframework.core.io.FileSystemResource;

public class FileSystemResourceDemo {
    @Test
    public void testFileSystemResource()
    {
        FileSystemResource fileSystemResource = new FileSystemResource("book.xml");
        System.out.println(fileSystemResource.getFile().getAbsolutePath());
        System.out.println(fileSystemResource.exists());
    }
}
