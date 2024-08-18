package uz.iskandarbek.expandable13

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uz.iskandarbek.expandable13.adapters.ExpandableAdapter
import uz.iskandarbek.expandable13.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), ExpandableAdapter.ExpandAction {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    lateinit var childDetailsMap: HashMap<String, String>

    lateinit var titleList: ArrayList<String>
    lateinit var map: HashMap<String, ArrayList<String>>
    lateinit var expandableAdapter: ExpandableAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        loadData()
        expandableAdapter = ExpandableAdapter(titleList, map, this)
        binding.expandble.setAdapter(this.expandableAdapter)


    }

    private fun loadData() {
        childDetailsMap = HashMap()
        map = HashMap()
        val isco1 = arrayListOf("Iphone", "Xiaomi", "Samsung", "Oppo", "Realmi", "Infinix")
        val isco2 = arrayListOf("Asus", "Acer", "Lenovo", "Hp", "MAC")
        val isco3 = arrayListOf("Sichqoncha", "Klaviatura", "Quloqchin", "Kalonka", "Web kamera")
        val isco4 = arrayListOf("Kreslo", "Javon", "Shkaf")
        val isco5 = arrayListOf("Yasin", "Samsungg", "LG", "Vista", "Shivaki")
        val isco6 = arrayListOf("Muzlatgich", "Gaz plita", "Kir yuvish mashinasi")



        titleList = arrayListOf(
            "Telefonlar",
            "Noutbuklar",
            "Kompyuter akssesuarlari",
            "Uy jihozlari",
            "Televizorlar",
            "Oshxona buyumlari"
        )

        map[titleList[0]] = isco1
        map[titleList[1]] = isco2
        map[titleList[2]] = isco3
        map[titleList[3]] = isco4
        map[titleList[4]] = isco5
        map[titleList[5]] = isco6

        childDetailsMap["Iphone"] =
            "iPhone — Apple Inc. firmasi tomonidan ishlab chiqarilgan toʻrtdiapazonli GSM-telefon, oʻz ichiga quyidagi funksiyalarni mujassamlashtiradi: iPod, kamerafon va internet-planshet." +
                    " MacOS operatsion sistemasi platformasida ishlaydi. Birinchi taqdimot Macworld konferensiyasida 2007-yil 9-yanvarda boʻlib oʻtdi." +
                    " Taqdimotni Steve Jobs olib bordi. iPhone sotuvlari AQSH bozorlarida 2007-yil 29-iyundan boshlandi. Sotuvlar Yevropa va Kanada bozorlarida" +
                    " 2007-yilning toʻrtinchi choragidan, Meksika, Avstraliya va Osiyo bozorlarida — 2008-yildan, Braziliya bozorlarida esa 2009-yildan sotila boshlanadi." +
                    " Rossiya va MDHda ishlab chiqaruvchining marketing siyosati tufayli sotilmaydi. "

            childDetailsMap["Xiaomi"] = "Xiaomi Corporation (talaffuzi: Shuomi Korpareyshn) — Xitoyning elektron uskunalar ishlab chiqaruvchi kompaniyasi boʻlib, " +
                    "2010-yilning aprel oyida asos solingan. Bosh ofisi Pekinda joylashgan. Xiaomi smartfonlar, mobil dasturlar, noutbuklar, sumkalar, quloqchinlar," +
                    " MI televezorlar, oyoq kiyimlar, fitnes brasletlar va boshqa koʻplab mahsulotlar ishlab chiqaradi va ularni ishlab chiqarishga investitsiya qiladi. " +
                    "Xiaomi shuningdek, Apple, Samsung va Huaweidan soʻng telefon chiplarini oʻzi ishlab chiqara olgan toʻrtinchi kompaniyadir. Xiaomi oʻzining dastlabki" +
                    " smartfonini 2011-yil avgustda taqdim etdi va tezkorlik bilan Xitoy bozoriga tarqaldi "
            childDetailsMap["Samsung"] = "Samsung telefonlari dunyo bo'ylab mashhur va keng tarqalgan brendlardan biridir. Ular yuqori sifatli, innovatsion texnologiyalar bilan jihozlangan va turli ehtiyojlarga mos keladigan modellarni taklif etadi. Samsung telefonlarining asosiy xususiyatlari quyidagilardan iborat:\n" +
                    "\n" +
                    "Galaxy S Seriyasi: Samsungning flagman modeli bo'lib, yuqori sifatli ekran, kuchli protsessor, va ilg'or kamera tizimlari bilan ajralib turadi. Ularning so'nggi modellarida 4K va 8K videolarni qo'llab-quvvatlash, yuqori tezlikdagi internet va ilg'or akkumulyator texnologiyalari mavjud.\n" +
                    "\n" +
                    "Galaxy Note Seriyasi: Asosiy xususiyati S Pen (stylus) bo'lib, bu model biznes va yaratuvchi ishlarda foydalanish uchun qulaydir. Ular katta ekranlar va kuchli xususiyatlar bilan mashhur.\n" +
                    "\n" +
                    "Galaxy A Seriyasi: O'rtacha narxdagi telefonlar bo'lib, yaxshi narx va sifat nisbatini ta'minlaydi. Ular yaxshi kameralar, akkumulyator va ekran sifatini taklif etadi, ammo flagman modellarga nisbatan kamroq ilg'or texnologiyalar bilan jihozlangan.\n" +
                    "\n" +
                    "Galaxy M Seriyasi: Boshqa seriyalardan farqli o'laroq, bu seriya narxni arzonroq saqlab qolishga va katta akkumulyatorlar bilan ta'minlashga e'tibor qaratadi. Asosan, kengroq auditoriya uchun mo'ljallangan.\n" +
                    "\n" +
                    "Galaxy Z Seriyasi: Foldable (qiyshayadigan) telefonlar, masalan, Galaxy Z Fold va Galaxy Z Flip, innovatsion dizayn va texnologiyalar bilan jihozlangan. Ular katta ekranli qurilmalarni kichikroq formatda taqdim etadi."

            childDetailsMap["Oppo"] = "OPPO Electronics Corporation premium maishiy elektronika ishlab chiqaruvchi hisoblanadi; BBK Electronics korporatsiyasining boʻlinmasi[1][2][3]. 2001-yilda tashkil etilgan.\n" +
                    "\n" +
                    "Brend dunyoning koʻplab mamlakatlarida roʻyxatdan oʻtgan. OPPO Digital Inc., AQShda joylashgan boʻlib, bir qator Hi-End Blu-ray pleyerlari, naushniklar va naushnik kuchaytirgichlari bilan AV mahsulotlarini loyihalashtiradi va ishlab chiqaradi.\n" +
                    "\n" +
                    "2008-yilda OPPO portativ elektronika segmentiga kirib kelgan va oʻzining mobil telefonlarini ishlab chiqarishni yoʻlga qoʻygan. OPPO smartfonlar olamidagi eng ishonchli va eng yaxshi 5 ta sotuvchidan biri hisoblanadi[4]."
            childDetailsMap["Realmi"] = "Realme birinchi marta 2010-yilda OPPO Real[1] nomi bilan tanilganida, OPPO Electronics OPPO Real smartfonlarining yangi qatorini taqdim etganida tilga olingan. 2018-yil 30-iyul kuni Oppo sobiq vitse-prezidenti Sky Li Oppo kompaniyasidan rasman ketishi va Realme’ni Xitoyning Sina Weibo mikrobloglar veb-saytida mustaqil brend sifatida yaratish niyati haqida e’lon qildi[2][3][4][5].\n" +
                    "\n" +
                    "Natijada, 2018-yilda ajralib chiqqandan soʻng, Realme BBK Electronics bosh kompaniyasiga tegishli mustaqil brendga aylandi."
            childDetailsMap["Infinix"] = "Infinix Mobile — Smartfon ishlab chiqaruvchi, Xitoyda joylashgan katta holding Transsion Holdingsga qarashli. " +
                    "Kelib chiqishi Fransiyada 1924-yilda tuzulgan Sagem, kompaniyasiga taqaladi."
            childDetailsMap["Asus"] = "1989-yil — markaziy platalarni (ona plata) ishlab chiqarishni boshladi. 2002-yil — ASRock shoʻba kompaniyasiga asos solindi." +
                    " 2003-yil sentyabr/oktyabr — J100 mobil telefoni ishlab chiqarildi. 2005-yil sentyabr — birinchi PhysX video tezlatgichi chiqarildi (u „Ageia“ kompaniyasi tomonidan ishlab chiqilgan va NVIDIAʼga sotilgan). 2005-yil dekabr — TLW32001 modei bilan LCD televizor bozoriga kirdi. Mahsulot faqat Tayvan bozorida mavjud. 2006-yil yanvar — VX seriyasini ishlab chiqish uchun Lamborghini bilan hamkorlikni eʼlon qildi." +
                    " 2006-yil 9 mart — ASUS Samsung va Founder bilan birgalikda oʻzini ilk Ultra-Mobile kompyuter modellari ishlab chiqaruvchilardan biri sifatida eʼlon qildi."
            childDetailsMap["Acer"] = "1976-yilda Sten Shi Mulitech International deb nomlangan kompaniyaga asos soldi.Kompaniyaning boshlangʻich kapitali \$25000 ni tashkil etgan edi." +
                    "Boshida kompaniya hodimlari soni 11 kishi boʻlgan.1979-yilda kompaniya eksport uchun moʻljallangan birinchi Tayvan kompyuterini ishlab chiqaradi.1981-yilda kompaniya" +
                    " 8-bitli MicroProfessor-II deb nomlangan prosessorni ishlab chiqardi.1985-yilda kompaniya IBMni ortda qoldirib dunyoda birinchi boʻlib 32-razryadli kompyuter ishlab chiqaradi.1994-yilda kompaniya kompyuter " +
                    "etkazib berish boʻyicha dunyoning yirik 10 kompaniyalari tarkibiga kiradi.1997-yilda kompaniya oʻzining X Computer deb nomlanuvchi yangi platformani namoyish etadi."
            childDetailsMap["Lenovo"] = "Kompaniyaga 1984-yil Xitoy Ilmiy Akademiyasi mablagʻlari yordami bilan xitoy olimlari tomonidan asos solingan. Boshida kompaniyaga 'New Technology Developer Incorporated' (ikki yil oʻtgach — 'Legend') nomi berilgan va u asosan Xitoyga kompyuter tehnologiyalari etkazish va shuningdek ierogliflarga kodirovka yaratish bilan shugʻullangan." +
                    " 2003-yil kompaniya nomini Lenovoga almashtirdi. 2004-yil dekabrda kompaniya IBM (AQSH kompaniyasi) ning kompyuter ishlab chiqarish boʻlimini sotib olish haqida eʼlon qildi."
            childDetailsMap["Hp"] = "Hewlett-Packard Company (koʻpincha HP deb yuritiladi) shaxsiy kompyuterlar, noutbuk kompyuterlar, serverlar, printerlar, fotoapparatlar, kalkulyatorlar, tarmoq boshqaruvi dasturlari va boshqa shunga oʻxshash mahsulotlar ishlab chiqaruvchi AQSh axborot texnologiyalari korporatsiyasidir. Asoschilari - William Hewlett va David Packard.\n" +
                    "\n" +
                    "Hewlett-Packard ayni paytda ikkita mustaqil kompaniya (HP Enterprise va HP Inc)ga" +
                    " ajralish harakatida. Hozircha yaxlit kompaniya boʻlgan HP brendi OS Windows 10 boshqaruvi ostida bir necha yangi isteʼmol qurilmalarini ishlab chiqardi."
            childDetailsMap["MAC"] = "MacBook — 2006-yildan beri, Apple kompaniyasining macOS operatsion tizimidan foydalanadigan Apple Inc. tomonidan ishlab chiqilgan " +
                    "va sotiladigan Mac noutbuklari brendi. 2005-yilda eʼlon qilingan Mac Intel protsessorlariga oʻtish paytida, u PowerBook va iBook brendlariga almashtirildi." +
                    " Hozirgi qator MacBook Air (2008-yildan hozirgi kungacha) va MacBook Pro (2006-yildan hozirgi kungacha) " +
                    "modellaridan iborat. Oddiygina „MacBook“ deb nomlangan ikki xil qurilma modeli 2006-yildan 2012-yilgacha va 2015-yildan 2019-yilgacha mavjud edi."
            childDetailsMap["Sichqoncha"] = "Boshqaruv «sichqoncha»si (inglizcha: mouse), «sichqon» yoki «sichqoncha» — mexanik boshqaruv qurilmasi."
            childDetailsMap["Klaviatura"] = "Klaviatura — maʼlumot kirgizish uchun yoki biror bir qurilmani boshqarish uchun moʻljallangan maʼlum tartibda joylashgan dastak tugma. Odatda, tugmachalar qoʻl barmoqlari bilan eziladi. Lekin, sensorli klaviaturalar ham boʻladi.\n" +
                    "Klaviatura (lotincha clavis — kalit) -1) musiqa cholgʻu sozlarida maʼlum tartibda joylashgan klavish (richag)lar majmui, klavish mexanizmi (tovush hosil qiluvchi va uni soʻndiruvchi richaglar tizimi)ning asosiy qismlaridan biri. 12-asrdan dastlab organyaa, soʻngra boshqa klavishli musiqa cholgʻularipa qoʻllanilgan."
            childDetailsMap["Quloqchin"] = "Stereofonik quloqchinlar (quloqchin) — maishiy radioelektron qurilmalarga ulanish uchun moʻljallangan[1]. Quloqchinlar — bu boshga kiyiladigan yoki toʻgʻridan-toʻgʻri quloq kanallariga oʻrnatilgan kichik minigarnituralardir[2]. Quloqchinlar koʻpincha kundalik hayotda va professional faoliyatda ovozli aloqa, musiqa va nutq tinglash uchun, harakatchanlik yoki atrofdagi qoʻshimcha tovushlardan xalos boʻlish uchun qoʻllaniladi[3]. Mikrofonli minigarnituralar eshitish vositasini tashkil qiladi. " +
                    "Baʼzan professional faoliyatda juftlik oʻrniga bitta alohida eshitish vositasi ishlatiladi, u monitor deb ataladi."
            childDetailsMap["Kalonka"] = "Smart dinamik yoki aqlli kalonka (inglizcha: smart speaker) — intellektual (aqlli) maishiy texnika sinfiga " +
                    "mansub qurilma, oʻrnatilgan kompyuter, mikrofon[1] (baʼzi hollarda, shuningdek, videokamera va suyuq kristall sensorli ekran) boʻlgan karnaydir."
            childDetailsMap["Web kamera"] = "Veb-kamera ― kompyuter va kompyuter tarmogʻlarida maʼlumotlarni yozib olish uchun moʻljallangan videokamera. Birinchi navbatda," +
                    " IP telefoniya, jonli uchrashuvlar, ijtimoiy media va xavfsizlik sohalarida qoʻllaniladi. Veb-kameralar, asosan, kompyuter va periferik qurilmalarga oʻrnatilgan boʻladi. USB yoki simsiz internet protokollari yordamida qurilmaga ulanadi. Veb-kameralardan Internet tarmogʻida 1993-yildayoq foydalanila boshlandi. Ushbu sohadagi ilk keng tarqalgan tijorat " +
                    "1994-yilda paydo boʻldi. Internetda veb-kameradan foydalanish sifati veb-saytlarga uzatiladigan statsionar kadrlar soni bilan cheklangan. "
            childDetailsMap["Kreslo"] = "Tirsaklarni qoʻyib, suyanib oʻtiriladigan keng kursi. ◆ Smirnov Pogodinni kresloga taklif qildi-yu, oʻzi ham uning yoniga stul keltirib oʻtir-gach, gapning oldini olib, soʻz qotdi. " +
                    "Sh. Rashidov, „Boʻrondan kuchli“ . ◆ Masharif Krriyev bilan Yoqutoy raisning roʻbaroʻsidagi kresloga oʻtirishdi. J. Sharipov, „Xorazm“ ."
            childDetailsMap["Javon"] = "Turli narsalar qoʻyiladigan mebel; shkaf. ◆ Kitob javoni. Kiyim javo-ni. m ◆ Uch derazali kabinet. Shifti past-roq. Javonlarga paxtasi chaman ochilgan turli nav gʻoʻzalar va probirkalar " +
                    " qoʻyilgan. S. Gʻ1u-rov, „Gʻ1arvon“ . ◆ Javonlarga tarixga oid kitob-lar did bilan taxlab qoʻyilgan. Nazarmat, „Joʻrlar baland sayraydi“ ."
            childDetailsMap["Shkaf"] = "Turli narsalar qoʻyiladigan mebel; shkaf. ◆ Kitob javoni. Kiyim javo-ni. m ◆ Uch derazali kabinet. Shifti past-roq. Javonlarga paxtasi chaman ochilgan turli nav gʻoʻzalar va probirkalar qoʻyilgan. " +
                    "S. Gʻ1u-rov, „Gʻ1arvon“ . ◆ Javonlarga tarixga oid kitob-lar did bilan taxlab qoʻyilgan. Nazarmat, „Joʻrlar baland sayraydi“ ."
            childDetailsMap["Yasin"] = "Yasin televizorlari o'zining arzonligi va yetarli funksiyalari bilan tanilgan. Ular HD va 4K pikselli turli LED ekranlarga ega modellarni taklif qilishadi. Narx jihatidan raqobatbardosh bo'lishi bilan birga, ko'p foydalanuvchilar uchun sifatli ko'rinish va yaxshi ovoz sifati " +
                    "ta'minlaydi. Ushbu televizorlar odatda oddiy dizayn va asosiy smart funksiyalar bilan jihozlangan bo'lib, kundalik foydalanish uchun mos keladi."
            childDetailsMap["Samsungg"] = "Samsung televizorlari dunyo bo'ylab mashhur bo'lib, yuqori sifat va ilg'or texnologiyalar bilan ajralib turadi. Ular UHD, 4K, 8K va QLED kabi yuqori pikselli va tasvir aniqligi bilan jihozlangan. Samsung televizorlari Quantum Dot texnologiyasi yordamida ranglarning to'liq spektrini va ajoyib kontrastni taqdim etadi. Bundan tashqari, Smart TV funksiyalari bilan foydalanish imkoniyati kengaytirilgan bo'lib, turli xil ilovalarga ulanish, " +
                    "ovozli boshqaruv va boshqa aqlli funksiyalarni qo'llab-quvvatlaydi. Dizayni ham zamonaviy va ingichka bo'lib, har qanday interyerni bezatadi."
            childDetailsMap["LG"] = "LG televizorlari yuqori sifatli ekran texnologiyalari, ayniqsa OLED va NanoCell texnologiyalari bilan tanilgan. OLED ekranlari chuqur qora ranglar va ajoyib kontrastni taqdim etadi, bu esa ranglarni tabiiyroq va jonliroq qiladi. NanoCell texnologiyasi esa aniq ranglar va keng ko'rish burchagini ta'minlaydi. LG televizorlari ko'pincha Dolby Vision va Dolby Atmos kabi ilg'or video va audio texnologiyalarini qo'llab-quvvatlaydi, bu esa ko'ngilochar tajribani yangi darajaga olib chiqadi. Smart TV funksiyalari orqali turli xil ilovalarga kirish imkoniyati, ovozli boshqaruv, va qo'shimcha" +
                    " uy jihozlari bilan integratsiya qilish imkoniyati mavjud. LG televizorlari zamonaviy dizayni va funksionalligi bilan o'z segmentida yetakchi hisoblanadi."
            childDetailsMap["Vista"] = "Vista televizorlari arzon narxi va o'rtacha sifatdagi mahsulotlari bilan tanilgan. Ushbu televizorlar odatda HD va Full HD piksellar bilan jihozlangan bo'lib, asosiy ko'ngilochar ehtiyojlar uchun mo'ljallangan. Vista televizorlari kundalik foydalanish uchun yetarli funksiyalarni taqdim etadi, ammo yuqori darajadagi texnologiyalar yoki premium funksiyalarni qidirayotgan foydalanuvchilar uchun bu televizorlar mos emas. Ular oddiy dizayn va asosiy audio-visual tajribani ta'minlaydi, shuning uchun ularni asosan arzon va sifatli televizor izlayotgan xaridorlar tanlaydi."
            childDetailsMap["Shivaki"] = "Shivaki televizorlari o'rtacha narxdagi mahsulotlari bilan tanilgan bo'lib, ular arzon va sifatli ko'ngilochar tizim izlayotgan foydalanuvchilar uchun mo'ljallangan. Ushbu televizorlar odatda LED texnologiyasiga ega bo'lib, HD va Full HD pikselli modellarni taklif qiladi. Shivaki televizorlari oddiy interfeys va oson boshqaruv bilan ta'minlangan, ammo ular yuqori darajadagi texnologiyalar yoki premium " +
                    "funksiyalarni taklif qilmaydi. Bu televizorlar kundalik foydalanish uchun mos bo'lib, asosiy ko'ngilochar tajriba uchun yetarli hisoblanadi."
            childDetailsMap["Muzlatgich"] = "Muzlatgichlar zamonaviy uy-ro'zg'or buyumlari orasida eng muhimlaridan biri hisoblanadi. Ular oziq-ovqat mahsulotlarini uzoq muddat saqlash va yangi saqlab qolish uchun mo'ljallangan. Zamonaviy muzlatgichlar turli xil xususiyatlarga ega, jumladan, ko'p zonali sovutish, avtomatik muz hosil qilish, energiya samaradorligi, va aqlli boshqaruv tizimlari. Muzlatgichlar ikki qavatli, uch qavatli, va yonma-yon turlarga bo'linadi. O'lchamlar va sig'imlar keng turda bo'lib, uydagi joy va oilaviy ehtiyojlarga" +
                    " qarab tanlanadi. Texnologiyalari bilan bir qatorda, zamonaviy dizaynlar ham mavjud bo'lib, ular uyni yanada chiroyli qilishga yordam beradi."
            childDetailsMap["Kir yuvish mashinasi"] = "Kir yuvish mashinalari uy-ro'zg'or buyumlari orasida kundalik hayotda muhim rol o'ynaydi. Ular kiyim-kechakni, to'shak to'shaklarini va boshqa mato mahsulotlarini yuvish uchun mo'ljallangan. "
            childDetailsMap["Gaz plita"] = "Gaz plitalari oshxonada ovqat pishirish uchun eng keng tarqalgan va qulay usullardan biridir. Ular gaz yordamida isitiladi va turli xil plitalar va pechlarga ega bo'ladi."
    }

    override fun childClick(name: String) {
        val intent = Intent(this, InfoActivity::class.java)
        intent.putExtra("item_name", name)
        intent.putExtra("item_detail", childDetailsMap[name])
        startActivity(intent)
    }
}