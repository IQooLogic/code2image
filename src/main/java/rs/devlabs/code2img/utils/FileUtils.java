package rs.devlabs.code2img.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import rs.devlabs.code2img.App;

/**
 *
 * @author Milos Stojkovic <iqoologic@gmail.com>
 */
public class FileUtils {

    private FileUtils() {
    }

    public static List<String> readBigFile(File file) throws FileNotFoundException {
        if (!file.exists()) {
            throw new FileNotFoundException("Source file doesn't exist!");
        }
        List<String> lines = new ArrayList<>();
        try ( BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lines;
    }

    public static List<String> read(File file) throws IOException {
        return Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
    }

    public static Optional<String> getExtension(File file) {
        String filename = file.getName();
        return Optional.ofNullable(filename)
                .filter(f -> f.contains("."))
                .map(f -> f.substring(filename.lastIndexOf(".") + 1));
    }
}
