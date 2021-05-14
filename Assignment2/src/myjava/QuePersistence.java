package myjava;
abstract class QuePersistence {

	
		abstract void persist();
	}

	class FilePersistence extends QuePersistence{

		
		void persist() {
			
			System.out.println("FilePersistence");
			
		}
	}

	class DataPersistence extends QuePersistence{

		
		void persist() {
			
			System.out.println("DataPersistence");
		}
		
		
	}
	class client{
	public static void main(String[] args) {
		QuePersistence p=new FilePersistence();
		p.persist();
		
		QuePersistence p2=new DataPersistence();
		p.persist();
	}

}
