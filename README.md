# Buzzer Checker

## Why?
Setelah kalian banyak mempelajari hal-hal yang erat dengan teori di perkuliahan, sekarang adalah saatnya kalian membuat aplikasi yang bersifat applicable dalam kehidupan sehari-hari. *Problem* yang ingin aku usung kali ini adalah susahnya menentukan sebuah akun di Twitter merupakan akun *real* atau akun *buzzer*. Seperti yang kita tahu, akun *buzzer* merupakan akun yang menyuarakan hal yang sama (biasanya > 1 akun) sehingga dapat mempengaruhi *trend* yang terjadi di media sosial. Biasanya, akun *buzzer* digunakan ketika sekelompok orang ingin menyatakan suatu kepentingan di media sosial. Oleh karena itu untuk membedakan apakah suatu *trend* dibangun oleh keresahan orang atau hanya diramaikan oleh para *buzzer*, kita memerlukan suatu aplikasi yang dapat membedakan apakah sebuah akun merupakan *buzzer* atau *real*.

## Spesifikasi Wajib (2500 poin)
<ol>
  <li>Aplikasi berbasis <i>website</i> dengan pemisahan <i>frontend</i> dan <i>backend</i> yang jelas dengan tujuan membuka kesempatan aplikasi kalian menjadi proyek <i>open-source</i>, terutama <i>backend</i>-nya, jika memang berpotensi.</li>
  <li>Aplikasi akan memanfaatkan <a href=https://developer.twitter.com/en/docs/twitter-api>Twitter API</a> dengan tujuan mengenalkan membaca dokumentasi.</li>
  <li>Aplikasi dapat menerima masukan <i>username</i> seseorang dan mengembalikan probabilitas apakah orang tersebut merupakan <i>buzzer</i> atau tidak.</li>
  <li>Menghitung probabilitas mengikuti <i>baseline</i> seperti di bawah ini:</li>
  <ol>
    <li>Suatu akun diwakili sebuah vektor berdimensi tiga.</li>
    <li>Dengan masing-masing dimensi mewakili apa dibebaskan kepada kalian. Contoh dari penulis soal, tanggal dibuatnya sebuah akun, waktu rata-rata selang satu tweet dengan tweet yang lain (dibatasi 10 tweet terakhir, <b>configurable</b>), dan jumlah kemunculan suatu kata. (diambil yang terbesar dan dibatasi 10 tweet terakhir, <b>configurable</b>)</li>
    <li>Buat sebuah vektor berdimensi tiga sebagai acuan, <b>configurable</b>. Contoh dari penulis soal, tanggal 15 Juni 2022, 30 menit, dan 10 kata.</li>
    <li>Selanjutnya, gunakan dot product dari kedua vektor tersebut untuk mendapatkan probabilitasnya. (materi sistem temu balik pada Algeo, cosine similarity)</li>
   </ol>
  <li>Semua ketentuan yang ditulis "configurable" dapat diatur nilainya melalui .env file. Jangan lupa disediakan .env.example sebagai contoh. (karena biasanya .env file tidak dipush ke dalam <i>repository</i>)</li>
  <li><i>Backend</i> dari aplikasi diwajibkan untuk di-deploy.</li>
  <li>Untuk menghitung banyaknya kemunculan suatu kata kalian dapat menggunakan algoritma TF-IDF, namun ini akan menjadi sedikit <i>tricky</i> karena bisa saja kata yang paling sering muncul bukan kata yang berhubungan dengan topik yang <i>buzzer</i> tersebut bawakan melainkan kata "stopwords".</li>
</ol>

## Spesifikasi Bonus (500 poin)
<ol>
  <li></li>
</ol>

## Saran Pengerjaan
