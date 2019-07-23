package com.spring.ioc.bean.resource;

import org.junit.Test;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

import java.io.IOException;
import java.io.InputStream;

/**
 * URLResource支持获取访问网络资源，是对URL类的装饰。
 */
public class UrlResourceTest {
    private static final String RESOURCE_PATH = "ftp://cmt:cmt!Q2w@10.211.93.155/apache-tomcat/webapps/commentServer/WEB-INF/classes/spring/application-service.xml";

    @Test
    public void testUrlResource() throws IOException {
        Resource resource = new UrlResource(RESOURCE_PATH);
        // 资源的文件名是什么
        System.out.println(resource.getFilename());//application-service.xml
        //表明这个资源是否代表了一个文件系统的文件
        System.out.println(resource.isFile());//false
        //返回一个布尔值，表明某个资源是否以物理形式存在
        System.out.println(resource.exists());//false
        //资源最后一次修改的时间戳
        System.out.println(resource.lastModified()); //0
        //返回某个文件，如果资源不能够被解析称为绝对路径，将会抛出FileNotFoundException
//        System.out.println(com.spring.ioc.bean.resource.getFile());//FileNotFoundException
        //表明资源的目录读取是否通过getInputStream()进行读取。
        System.out.println(resource.isReadable());//true
        //获取文件的长度
        System.out.println(resource.contentLength());//2579
        //返回资源的描述，用来输出错误的日志。这通常是完全限定的文件名或资源的实际URL
        //URL [ftp://cmt:cmt!Q2w@10.211.93.155/apache-tomcat/webapps/commentServer/WEB-INF/classes/spring/application-service.xml]
        System.out.println("description : " + resource.getDescription());
        //URI
        // ftp://cmt:cmt!Q2w@10.211.93.155/apache-tomcat/webapps/commentServer/WEB-INF/classes/spring/application-service.xml
        System.out.println("uri : " + resource.getURI());
        //URL
        // ftp://cmt:cmt!Q2w@10.211.93.155/apache-tomcat/webapps/commentServer/WEB-INF/classes/spring/application-service.xml
        System.out.println("url : " + resource.getURL());
        //返回一个布尔值，指示此资源是否具有开放流的句柄。如果为true，InputStream就不能够多次读取，
        // 只能够读取一次并且及时关闭以避免内存泄漏。对于所有常规资源实现，返回false，但是InputStreamResource除外
        System.out.println("isOpen : " + resource.isOpen());//false
        //定位和打开资源，返回一个InputStream读取资源，每一个调用返回一个新的InputStream，调用者有责任关闭这个stream
        InputStream inputStream = resource.getInputStream();

        byte[] bytes = new byte[1024000];
        resource.getInputStream().read(bytes);
        System.out.println("isOpen after inputStream: " + resource.isOpen());//false

        System.out.println("getInputStream: " + new String(bytes));

    }
}
