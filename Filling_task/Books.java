
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Books {
	private String name;
	private int bookId;
	private double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public static void main(String args[]) throws IOException {
		Scanner s=new Scanner(System.in);
		Scanner s1=new Scanner(System.in);
		FileWriter fw=null;
		FileReader fr=null;
		File f=new File("book.txt");
		Books crud=new Books();
		List<Books> li=new ArrayList<Books>();
		List<String> list=new ArrayList<>();
		int ch;
		do {
			System.out.println("----CRUD APPLICATION-----");
			  System.out.println("1: ADD Book\n2: UPDATE Book\n3: DELETE Book\n4: GET Book\n5: EXIT");
			  System.out.print("enter your choice: ");
			  ch=s.nextInt();
			  switch(ch) {
			  case 1:
				  crud.addBook(li, f);
				  crud.writeData(li, f);
				  System.out.println("-----Book is added Successfully!-----");
				  break;
			  case 2:
				  crud.updateBook(list, f);
				  System.out.println("------Record is updated Successfully!------");
				  break;
			  case 3: 
				  crud.removeBook(list, f);
				  System.out.println("--------Data is Removed Successfully!---------");
				  break;
			  case 4:
				  System.out.println("--------Data of Books----------------");
				  crud.getAll(f);
				  break;
			  }
			
		}
		while(ch!=5);
		
	}
	public void addBook(List<Books>li, File f) {
		Books b=new Books();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter book name: ");
		b.setName(sc.nextLine());
		System.out.print("Enter book ID: ");
		b.setBookId(sc.nextInt());
		System.out.print("Enter book Price: ");
		b.setPrice(sc.nextDouble());
		li.add(b);
	}
	
	public void writeData(List<Books> li,File f) {
		FileWriter fw=null;
		try {
			fw=new FileWriter(f);
			fw.write("ID          Name          Price\n");
			for(Books b: li) {
				fw.write(b.getBookId()+"    "+b.getName()+"      "+b.getPrice()+" \n");
			}
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void updateBook(List<String> li, File f) {
		//li.clear();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ID of book you wanted to Update: ");
		String bookId = sc.next();

		BufferedReader bf = null;
		String line;

		try {

			bf = new BufferedReader(new FileReader(f));
			try {
				while ((line = bf.readLine()) != null) {
					if (line.contains(bookId)) {
						System.out.println("What do yo want to update:\n1-Name\n2- price\n");
						System.out.print("enter your choice: ");
						int choice = sc.nextInt();
						String oldName;
						String newName;
						String oldPrice;
						String newPrice;
						if (choice == 1) {
							System.out.print("Enter old name: ");
							oldName = sc.next();
							System.out.print("Enter new name: ");
							newName = sc.next();
							li.add(line.replace(oldName, newName));
						} else if (choice == 2) {
							System.out.print("Enter old Price: ");
							oldPrice = sc.next();
							System.out.print("Enter new Price: ");
							newPrice = sc.next();
							li.add(line.replace(oldPrice, newPrice));
						}
					} else {
						li.add(line);
					}
				}
			} catch (IOException ex) {

				ex.printStackTrace();
			}
		} catch (IOException ex) {

			ex.printStackTrace();
		} finally {
			try {
				bf.close();
			} catch (IOException ex) {

				ex.printStackTrace();
			}
		}

		FileWriter fw=null;
		try {
			fw = new FileWriter(f);

			for (String s : li) {
				fw.append(s);
				fw.append("\n");
			}
		} catch (IOException ex) {

			ex.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException ex) {

				ex.printStackTrace();
			}
		}
	}
	
	
	public void removeBook(List<String> li, File f) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the Id of Book you wants to remove: ");
		String id=sc.next();
		//li.clear();
		BufferedReader br=null;
		String line;
		try {
			br = new BufferedReader(new FileReader(f));
			try {
				while ((line = br.readLine()) != null) {
					if (line.contains(id)) {
						continue;
					} else {
						li.add(line);
					}
				}
			} catch (IOException ex) {

				ex.printStackTrace();
			}
		} catch (FileNotFoundException ex) {

			ex.printStackTrace();
		}

		FileWriter fw=null;
		try {
			fw = new FileWriter(f);

			for (String s : li) {
				fw.append(s);
				fw.append("\n");
			}
		} catch (IOException ex) {

			ex.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException ex) {

				ex.printStackTrace();
			}
		
	}
	}
	public void getAll(File f) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String line;

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException ex) {

			ex.printStackTrace();
		}
		System.out.println();
	}

}
