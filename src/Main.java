import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		int i,menu=-1;
		String answer=null ,fam=null ,type = null,debt= null;
		float k=0,j=0,l=0,m=0,o=0,p=0,q=0,r=0,s=0,t=0,u=0,v=0,w=0,x=0,y=0,z=0,yii=0,zii=0,yiii=0,ziii=0,yiv=0,ziv=0,d=0,e=0,f=0,g=0,h=0,hh=0;
		int a=0;
		float pbaik=0,pburuk=0,psedangbaik=0,psedangburuk=0,psedikitbaik=0,psedikitburuk=0,pbanyakbaik=0,pbanyakburuk=0,pkosongbaik=0,pkosongburuk=0,p2baik=0,p2buruk=0;
		float p3baik=0,p3buruk=0,pibaik=0,piburuk=0,piibaik=0,piiburuk=0,piiibaik=0,piiiburuk=0,pivbaik=0,pivburuk=0,prediksibaik=0,prediksiburuk=0,ppkecilbaik=0,ppkecilburuk=0,ppsedangbaik=0,ppsedangburuk=0,ppbesarbaik=0,ppbesarburuk=0;
		
		Nasabah[] nasabah = new Nasabah[40];
		nasabah[0] = new Nasabah(2,"iii","sedang","baik","kecil");
		nasabah[1]= new Nasabah(3,"ii","sedang","bermasalah","sedang");
		nasabah[2]= new Nasabah(2,"ii","sedang","baik","kecil");
		nasabah[3]= new Nasabah(3,"iii","sedikit","baik","sedang");
		nasabah[4]= new Nasabah(3,"iv","sedikit","baik","sedang");
		nasabah[5]= new Nasabah(3,"iii","sedang","baik","kecil");
		nasabah[6]= new Nasabah(3,"ii","banyak","bermasalah","sedang");
		nasabah[7]= new Nasabah(3,"ii","sedikit","baik","sedang");
		nasabah[8]= new Nasabah(3,"ii","sedikit","bermasalah","besar");
		nasabah[9]= new Nasabah(3,"iii","sedang","baik","sedang");
		nasabah[10]= new Nasabah(2,"iii","banyak","baik","sedang");
		nasabah[11]= new Nasabah(3,"ii","banyak","baik","besar");
		nasabah[12]= new Nasabah(3,"iv","sedikit","baik","besar");
		nasabah[13]= new Nasabah(2,"iii","sedikit","bermasalah","besar");
		nasabah[14]= new Nasabah(2,"ii","sedikit","baik","sedang");
		nasabah[15]= new Nasabah(2,"ii","sedang","baik","sedang");
		nasabah[16]= new Nasabah(2,"iii","sedikit","baik","sedang");
		nasabah[17]= new Nasabah(3,"i","banyak","bermasalah","sedang");
		nasabah[18]= new Nasabah(3,"ii","sedikit","bermasalah","besar");
		nasabah[19]= new Nasabah(3,"iii","banyak","baik","sedang");
		nasabah[20]= new Nasabah(3,"ii","kosong","baik","sedang");
		nasabah[21]= new Nasabah(3,"iii","kosong","baik","sedang");
		nasabah[22]= new Nasabah(2,"iii","sedikit","baik","kecil");
		nasabah[23]= new Nasabah(3,"iii","sedang","baik","kecil");
		nasabah[24]= new Nasabah(3,"iv","sedang","baik","sedang");
		nasabah[25]= new Nasabah(3,"iv","kosong","baik","sedang");
		nasabah[26]= new Nasabah(3,"iv","banyak","baik","sedang");
		nasabah[27]= new Nasabah(3,"iii","sedikit","baik","besar");
		nasabah[28]= new Nasabah(3,"iii","sedang","bermasalah","sedang");
		nasabah[29]= new Nasabah(3,"ii","sedang","baik","sedang");
		nasabah[30]= new Nasabah(3,"iv","sedikit","baik","sedang");
		nasabah[31]= new Nasabah(3,"iii","kosong","baik","besar");
		nasabah[32]= new Nasabah(3,"iii","sedikit","baik","kecil");
		nasabah[33]= new Nasabah(3,"ii","kosong","baik","besar");
		nasabah[34]= new Nasabah(3,"i","sedang","bermasalah","sedang");
		nasabah[35]= new Nasabah(2,"iv","sedang","baik","kecil");
		nasabah[36]= new Nasabah(3,"iv","sedang","baik","besar");
		nasabah[37]= new Nasabah(3,"iii","sedikit","bermasalah","sedang");
		nasabah[38]= new Nasabah(2,"iv","sedikit","baik","kecil");
		nasabah[39]= new Nasabah(3,"i","kosong","bermasalah","sedang");
		
		Nasabah[] prediksi = new Nasabah['a']; 
		
		
		//naive baye pro baik bermasalah
		for(i=0;i<40;i++) {
			
			if(nasabah[i].hasil == "baik" ) {
				k=k+1;
			}else if (nasabah[i].hasil == "bermasalah"){
				j=j+1;
			}
			
			pbaik=k/40;
			pburuk=j/40;
		
			if(nasabah[i].pinjaman == "kecil" && nasabah[i].hasil == "baik") {
				d++;
			}else if(nasabah[i].pinjaman == "kecil" && nasabah[i].hasil == "bermasalah") {
				e++;
			}
			ppkecilbaik=d/k;
			ppkecilburuk=e/j;		
			
			if(nasabah[i].pinjaman == "sedang" && nasabah[i].hasil == "baik") {
				f = f+1;
			}else if(nasabah[i].pinjaman == "sedang" && nasabah[i].hasil == "bermasalah") {
				g++;
			}
			ppsedangbaik=f/k;
			ppsedangburuk=g/j;
			
			if(nasabah[i].pinjaman == "besar" && nasabah[i].hasil == "baik") {
				h++;
			}else if(nasabah[i].pinjaman == "besar" && nasabah[i].hasil == "bermasalah") {
				hh++;
			}
			ppbesarbaik=h/k;
			ppbesarburuk=hh/j;
			
		
			if(nasabah[i].tanggungan == "sedang" && nasabah[i].hasil == "baik") {
				l = l+1;
			}else if(nasabah[i].tanggungan == "sedang" && nasabah[i].hasil == "bermasalah") {
				m = m+1;
			}
			psedangbaik=l/k;
			psedangburuk = m/j;
			
			if(nasabah[i].tanggungan == "sedikit" && nasabah[i].hasil == "baik") {
				o = o+1;
			}else if(nasabah[i].tanggungan == "sedikit" && nasabah[i].hasil == "bermasalah") {
				p = p+1;
			}
			psedikitbaik=o/k;
			psedikitburuk=p/j;
			
			if(nasabah[i].tanggungan == "banyak" && nasabah[i].hasil == "baik") {
				q = q+1;
			}else if(nasabah[i].tanggungan == "banyak" && nasabah[i].hasil == "bermasalah") {
				r = r+1;
			}
			pbanyakbaik=q/k;
			pbanyakburuk=r/j;
			
			if(nasabah[i].tanggungan == "kosong" && nasabah[i].hasil == "baik") {
				s = s+1;
			}else if(nasabah[i].tanggungan == "kosong" && nasabah[i].hasil == "bermasalah") {
				t = t+1;
			}
			pkosongbaik=s/k;
			pkosongburuk=t/j;
			
			if(nasabah[i].waktu == 2 && nasabah[i].hasil == "baik") {
				u = u+1;
			}else if(nasabah[i].waktu == 2 && nasabah[i].hasil == "bermasalah") {
				v = v+1;
			}
			p2baik=u/k;
			p2buruk=v/j;
			
			if(nasabah[i].waktu == 3 && nasabah[i].hasil == "baik") {
				w = w+1;
			}else if(nasabah[i].waktu == 3 && nasabah[i].hasil == "bermasalah") {
				x = x+1;
			}
			p3baik=w/k;
			p3buruk=x/j;
			
			if(nasabah[i].gol == "ii" && nasabah[i].hasil == "baik") {
				yii = yii+1;
			}else if(nasabah[i].gol == "ii" && nasabah[i].hasil == "bermasalah") {
				zii = zii+1;
			}
			piibaik=yii/k;
			piiburuk=zii/j;
			
			if(nasabah[i].gol == "iii" && nasabah[i].hasil == "baik") {
				yiii = yiii+1;
			}else if(nasabah[i].gol == "iii" && nasabah[i].hasil == "bermasalah") {
				ziii = ziii+1;
			}
			piiibaik=yiii/k;
			piiiburuk=ziii/j;
			
			if(nasabah[i].gol == "iv" && nasabah[i].hasil == "baik") {
				yiv = yiv+1;
			}else if(nasabah[i].gol == "iv" && nasabah[i].hasil == "bermasalah") {
				ziv = ziv+1;
			}
			pivbaik=pivbaik/k;
			pivburuk=pivburuk/j;
			
			
			if(nasabah[i].gol == "i" && nasabah[i].hasil == "baik") {
				y = y+1;
			}else if(nasabah[i].gol == "i" && nasabah[i].hasil == "bermasalah") {
				z = z+1;
			}
			pibaik=y/k;
			piburuk=z/j;
		}
		
		
		while(menu!=4) {
				menu = Integer.parseInt(JOptionPane.showInputDialog("1. Prediksi Nasabah\n2. Riwayat Nasabah\n3. Data Training\n4. Exit"));
				
					switch(menu) {
						
					case 1 : 	int tanggungan  =	Integer.parseInt(JOptionPane.showInputDialog("Jumlah tanggungan  (1.Sedikit 2.Sedang 3. Banyak 4.kosong"));
				  				int	golongan =	Integer.parseInt(JOptionPane.showInputDialog("Golongan (1.i 2.ii 3.iii 4.iv) "));
				  				int	pinjaman = Integer.parseInt(JOptionPane.showInputDialog("Pinjaman (1.kecil 2.sedang 3.besar"));
				  				int	waktu = Integer.parseInt(JOptionPane.showInputDialog("jangka waktu ( 2 tahun / 3 tahun)"));
				  				
				  				if(tanggungan == 1){
				  					prediksibaik=pbaik*psedikitbaik;
				  					prediksiburuk=pburuk*psedikitburuk;
				  					fam="sedikit";
				  				}else if(tanggungan ==2 ) {
				  					prediksibaik=pbaik*psedangbaik;
				  					prediksiburuk=pburuk*psedangburuk;
				  					fam="sedang";
				  				}else if(tanggungan ==3) {
				  					prediksibaik=pbaik*pbanyakbaik;
				  					prediksiburuk=pburuk*pbanyakburuk;
				  					fam="banyak";
				  				}else if(tanggungan ==4) {
				  					prediksibaik=pbaik*pkosongbaik;
				  					prediksiburuk=pburuk*pkosongburuk;
				  					fam="kosong";
				  				}
				  				
				  				if(golongan==1) {
				  					prediksibaik=prediksibaik*pibaik;
				  					prediksiburuk=prediksiburuk*piburuk;
				  					type ="i";
				  				}else if (golongan==2) {
				  					prediksibaik=prediksibaik*piibaik;
				  					prediksiburuk=prediksiburuk*piiburuk;
				  					type = "ii";
				  				}else if(golongan==3) {
				  					prediksibaik=prediksibaik*piiibaik;
				  					prediksiburuk=prediksiburuk*piiburuk;
				  					type ="iii";
				  				}else if(golongan==4) {
				  					prediksibaik=prediksibaik*pivbaik;
				  					prediksiburuk=prediksiburuk*pivburuk;
				  					type ="iv";
				  				}
				  				
				  				if(pinjaman==1) {
				  					prediksibaik=prediksibaik*ppkecilbaik;
				  					prediksiburuk=prediksiburuk*ppkecilburuk;
				  					debt ="sedikit";
				  				}else if (pinjaman==2) {
				  					prediksibaik=prediksibaik*ppsedangbaik;
				  					prediksiburuk=prediksiburuk*ppsedangburuk;
				  					debt ="sedang";
				  				}else if (pinjaman==3) {
				  					prediksibaik=prediksibaik*ppbesarbaik;
				  					prediksiburuk=prediksiburuk*ppbesarburuk;
				  					debt = "banyak";
				  				}
				  				
				  				if(waktu==2){
				  					prediksibaik=prediksibaik*p2baik;
				  					prediksiburuk=prediksiburuk*p2buruk;
				  	
				  				}else if (waktu==3) {
				  					prediksibaik=prediksibaik*p3baik;
				  					prediksiburuk=prediksiburuk*p3buruk;
				  				}
				  				
				  				JOptionPane.showMessageDialog(null, "kemuungkinan baik : \n" +prediksibaik+ "\nkemungkinan buruk :\n"+prediksiburuk ); 
				  				
				  				if(prediksibaik<prediksiburuk) {
				  					JOptionPane.showMessageDialog(null, "Prediksi Adalah buruk");
				  					answer="bermasalah";
				  				}else if(prediksiburuk<prediksibaik) {
				  					JOptionPane.showMessageDialog(null, "prediksi Adalah baik");
				  					answer="baik";
				  				}
				  				
				  				prediksi[a]=new Nasabah(waktu,type,fam,answer,debt);
				  				a++;
								break;
								
					case 2 :
						System.out.println(p2buruk);
						
						for(i=0;i<a;i++) {
						JOptionPane.showMessageDialog(null,"Nomor "+(i+1)+"\nJumlah Tanggungan : "+prediksi[i].tanggungan+"\nGolongan : "+prediksi[i].gol+"\nPinjaman : "+prediksi[i].pinjaman+"\nJangka Waktu : "+prediksi[i].waktu+"Hasil : "+prediksi[i].hasil);							
						}
						break;
							
						case 3 : for(i=0;i<40;i++) {
							JOptionPane.showMessageDialog(null,"Nomor "+(i+1)+"\nJumlah Tanggungan : "+nasabah[i].tanggungan+"\nGolongan : "+nasabah[i].gol+"\nPinjaman : "+nasabah[i].pinjaman+"\nJangka Waktu : "+nasabah[i].waktu+"Hasil : "+nasabah[i].hasil);
						}
							break;
					case 4:
						System.out.println("Iqbal Alfiansyah");
						break;
						
						
						
						
						
						
					}
		}
	
		
	}

}
