/*-------------------*
| Rodrigo CavanhaMan |
| URI 1758           |
| Pontos Extras      |
*--------------------*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Reader1 in = new Reader1(System.in);
		Writer1 out = new Writer1(System.out);
		
		Locale.setDefault(Locale.US);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			int provas = in.nextInt();
			int alunos = in.nextInt();
			
			for (int j = 0; j < alunos;j++) {
				double sum = 0d;
				double maior = 0;
				double maiorR = 0;
				for (int k = 0; k < provas; k++) {
					double nota = in.nextDouble();
					sum += nota;
					if (nota > maior) 
						maior = nota;
					if (nota < 7 && nota > maiorR) 
						maiorR = nota;
				}
				double media = sum / provas;
				if (media >= 7) {
					media = media > maior?media:maior;
				}
				else if (media >= 4) {
					media = media > maiorR? media:maiorR;
				}  
				out.print(media);
			}
		}
		in.close(); 
        out.flush();
        out.close();
	}
}

class Reader1 implements Closeable {

    private final BufferedReader reader;
    private StringTokenizer tokenizer;

    public Reader1(InputStream input) {
        reader = new BufferedReader(new InputStreamReader(input));
        tokenizer = new StringTokenizer("");
    }

    private StringTokenizer getTokenizer() throws IOException {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            String line = nextLine();
            if (line == null) 
                return null;
            tokenizer = new StringTokenizer(line);
        }
        return tokenizer;
    }

    public boolean hasNext() throws IOException {
        return getTokenizer() != null;
    }

    public String next() throws IOException {
        return hasNext() ? tokenizer.nextToken() : null;
    }

    public String nextLine() throws IOException {
        tokenizer = null;
        return reader.readLine();
    }

    public int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    public long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public float nextFloat() throws IOException {
        return Float.parseFloat(next());
    }

    public double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    public String[] nextStringArray(int size) throws IOException {
        String[] array = new String[size];
        for (int i = 0; i < size; i++)
            array[i] = next();
        return array;
    }

    public int[] nextIntArray(int size) throws IOException {
        int[] array = new int[size];
        for (int i = 0; i < size; i++)
            array[i] = nextInt();
        return array;
    }

    public long[] nextLongArray(int size) throws IOException {
        long[] array = new long[size];
        for (int i = 0; i < size; i++)
            array[i] = nextLong();
        return array;
    }

    public double[] nextDoubleArray(int size) throws IOException {
        double[] array = new double[size];
        for (int i = 0; i < size; i++)
            array[i] = nextDouble();
        return array;
    }

    @Override
    public void close() throws IOException {
        tokenizer = null;
        reader.close();
    }
}

class Writer1 {

    private final PrintWriter writer;

    public Writer1(OutputStream outputStream) {
        writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
    }

    public void print(Object... objects) {
        for (int i = 0; i < objects.length; i++) {
            if (i != 0) 
                writer.print(' ');
            writer.format("%.2f\n",objects[i]);
        }
    }

    public void println(Object... objects) {
        print(objects);
        writer.println();
    }

    public void close() {
        writer.close();
    }

    public void flush() {
        writer.flush();
    }


}
