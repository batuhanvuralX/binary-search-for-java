public class Main {


    public static int binary_search(int[] arr,int target){
        // burada başlangıç ve bitiş değerleri belirleniyor
        int start = 0;
        int end = arr.length -1;

        // döngüyü başlatılıyor
        while (start <= end){
            // dizinin orta değeri hesaplanıyor
            int mid = (start + end) /2;

            // ğeger dizinin ortası sonuçsa değer bulunuyor
            if (arr[mid] == target){
                return mid;
                // eğer değer aranandan küçükse -1 yapıp sola gidiliyor
            } else if (arr[mid] > target) {
                end = mid -1;
           // eğer aranan değer büyükse +1 yapıp sağa gidiliyor
            }else{
                start = mid +1;
            }
        }
        // aranan değer yoksa -1 değeri döndürülüyor
    return -1;
    }




    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,11,22,33,44,55};
        int target = 66;

        int result = binary_search(arr,target);

        // eğer result -1 değilse yani hedef varsa sonucu yazdılıyor
        if(result !=-1){
            System.out.println(target + " öğresi dizinde " + result + " indekste bulundu ");
        }else{
            System.out.println(target + " bulunamadı ");
        }


    }
}