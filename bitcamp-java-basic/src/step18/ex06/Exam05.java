// 응용 - 5) 파일 정보 대신 클래스 정보를 리턴한다.
package step18.ex06;

import java.io.File;
import java.io.FileFilter;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

// => 파일 정보 대신 클래스 정보를 목록에 저장한다.
public class Exam05 {
    
    public static void main(String[] args) throws Exception {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        URL url = classLoader.getResource("step18");

        List<Class> classes = findClasses(new File(url.getPath()), "step18");

        for (Class clazz : classes) {
            System.out.println(clazz.getName());
        }
    }
    
    static List<Class> findClasses(File dir, String packagename) throws Exception {
        File file = new File(dir.getPath());
        File[] files = dir.listFiles(new FileFilter() {
            public boolean accept(File file) {
                if (file.isDirectory() ||
                        (file.getName().endsWith(".class") &&
                        !file.getName().contains("$")))
                    return true;
                return false;
            }
        });
        
        ArrayList<Class> list = new ArrayList<>();
        for (File f : files) {
            if (f.isDirectory()) {
                list.addAll(findClasses(f, packagename + "." + f.getName()));
            } else {
                String classname = packagename + "." + f.getName();
                list.add(Class.forName(
                        classname.substring(0, classname.length() -6)));
            }
        }
        return list;
    }
}
