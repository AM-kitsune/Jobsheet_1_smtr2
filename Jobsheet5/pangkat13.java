public class pangkat13 {
    int nilai, pangkat;
    pangkat13(int n, int p){
        nilai = n;
        pangkat = p;
    }

    int pangkatBF(){
        int hasil = 1;
        for (int i = 0; i < pangkat; i++) {
            hasil = hasil*nilai;
        }
        return hasil;
    }

    int pangkatDC(int a, int n){
        if (n==1) {
            return a;
        }else {
            if (n %2 ==1) {
                return (pangkatDC(a, n/2) * pangkatDC(a, n/2) * a);
            }else {
                return (pangkatDC(a, n/2) * pangkatDC(a, n/2));
            }
        }
    }
}
