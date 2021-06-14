package com.example.myworld

object CountryData {


    private val countryName = arrayOf("Canada", "Indonesia", "Japan", "Kenya", "New Zealand",
            "Qatar", "Switzerland", "Thailand", "Turkey", "United Kingdom")

    private val countryDetail = arrayOf(": Ottawa", ": Jakarta", ": Tokyo", ": Nairobi", ": Wellington",
            ": Doha", ": Bern", ": Bangkok", ": Ankara", ": London")

    private val descriptionDetail = arrayOf("Canada is a country in the northern part of North America. Its ten provinces and three territories extend from the Atlantic to the Pacific and northward into the Arctic Ocean, covering 9.98 million square kilometres (3.85 million square miles), making it the world's second-largest country by total area. Its southern and western border with the United States, stretching 8,891 kilometres (5,525 mi), is the world's longest bi-national land border. Canada's capital is Ottawa, and its three largest metropolitan areas are Toronto, Montreal, and Vancouver.",

            "Indonesia officially the Republic of Indonesia (Indonesian: Republik Indonesia [reˈpublik ɪndoˈnesia]),is a country in Southeast Asia and Oceania, between the Indian and Pacific oceans. It consists of more than seventeen thousand islands, including Sumatra, Java, Sulawesi, and parts of Borneo (Kalimantan) and New Guinea (Papua). Indonesia is the world's largest island country and the 14th-largest country by land area, at 1,904,569 square kilometres (735,358 square miles). With more than 270 million people, Indonesia is the world's fourth-most populous country and the most populous Muslim-majority country. Java, the world's most populous island, is home to more than half of the country's population.",

            "Japan or Nihon  is an island country in East Asia, located in the northwest Pacific Ocean. It is bordered on the west by the Sea of Japan, and extends from the Sea of Okhotsk in the north toward the East China Sea and Taiwan in the south. Part of the Ring of Fire, Japan spans an archipelago of 6852 islands covering 377,975 square kilometers (145,937 sq mi); the five main islands are Hokkaido, Honshu, Shikoku, Kyushu, and Okinawa. Tokyo is Japan's capital and largest city; other major cities include Yokohama, Osaka, Nagoya, Sapporo, Fukuoka, Kobe, and Kyoto.",

            "Kenya, officially the Republic of Kenya (Swahili: Jamhuri ya Kenya), is a country in Eastern Africa. At 580,367 square kilometres (224,081 sq mi), Kenya is the world's 48th largest country by total area. With a population of more than 47.6 million people in the 2019 census, Kenya is the 29th most populous country. Kenya's capital and largest city is Nairobi, while its oldest city and first capital is the coastal city of Mombasa. Kisumu City is the third largest city and also an inland port on Lake Victoria. Other important urban centres include Nakuru and Eldoret. As of 2020, Kenya is the third largest economy in sub-Saharan Africa after Nigeria and South Africa. Kenya is bordered by South Sudan to the northwest, Ethiopia to the north, Somalia to the east, Uganda to the west, Tanzania to the south, and the Indian Ocean to the southeast.",

            "New Zealand (Māori: Aotearoa [aɔˈtɛaɾɔa]) is an island country in the southwestern Pacific Ocean. It consists of two main landmasses—the North Island (Te Ika-a-Māui) and the South Island (Te Waipounamu)—and more than 700 smaller islands, covering a total area of 268,021 square kilometres (103,500 sq mi). New Zealand is about 2,000 kilometres (1,200 mi) east of Australia across the Tasman Sea and 1,000 kilometres (600 mi) south of the islands of New Caledonia, Fiji, and Tonga. The country's varied topography and sharp mountain peaks, including the Southern Alps, owe much to tectonic uplift and volcanic eruptions. New Zealand's capital city is Wellington, and its most populous city is Auckland.",

            "Qatar local vernacular pronunciation: [ˈɡɪtˤɑr]),officially the State of Qatar (Arabic: دولة قطر Dawlat Qaṭar), is a country located in Western Asia, occupying the small Qatar Peninsula on the northeastern coast of the Arabian Peninsula. Its sole land border is with neighbouring Gulf Cooperation Council (GCC) monarchy Saudi Arabia to the south, with the rest of its territory surrounded by the Persian Gulf. The Gulf of Bahrain, an inlet of the Persian Gulf, separates Qatar from nearby Bahrain.",

            "Switzerland, officially the Swiss Confederation, is a country situated at the confluence of Western, Central, and Southern Europe. It is a federal republic composed of 26 cantons, with federal authorities based in Bern. Switzerland is a landlocked country bordered by Italy to the south, France to the west, Germany to the north, and Austria and Liechtenstein to the east. It is geographically divided among the Swiss Plateau, the Alps, and the Jura, spanning a total area of 41,285 km2 (15,940 sq mi), and land area of 39,997 km2 (15,443 sq mi). While the Alps occupy the greater part of the territory, the Swiss population of approximately 8.5 million is concentrated mostly on the plateau, where the largest cities and economic centres are located, among them Zürich, Geneva and Basel. These cities are home to several offices of international organisations such as the headquarters of FIFA, the UN's second-largest Office, and the main building of the Bank for International Settlements. The main international airports of Switzerland are also located in these cities.",

            "Thailand, officially the Kingdom of Thailand and formerly known as Siam, is a country in Southeast Asia. Located at the centre of the Indochinese Peninsula, it is composed of 76 provinces spanning 513,120 square kilometres (198,120 sq mi), with a population of over 66 million people; Thailand is the world's 50th-largest country by land area and the 22nd-most-populous. The capital and largest city is Bangkok, a special administrative area. Thailand is bordered to the north by Myanmar and Laos, to the east by Laos and Cambodia, to the south by the Gulf of Thailand and Malaysia, and to the west by the Andaman Sea and the southern extremity of Myanmar. Its maritime boundaries include Vietnam in the Gulf of Thailand to the southeast, and Indonesia and India on the Andaman Sea to the southwest. Nominally, Thailand is a constitutional monarchy and parliamentary democracy; however, in recent history, its government has experienced multiple coups and periods of military dictatorships.",

            "Turkey (Turkish: Türkiye [ˈtyɾcije]), officially the Republic of Turkey (Turkish: Türkiye Cumhuriyeti [ˈtyɾcije dʒumˈhuːɾijeti]), is a transcontinental country straddling Southeastern Europe and Western Asia. It is bordered on its northwest by Greece and Bulgaria; north by the Black Sea; northeast by Georgia; east by Armenia, Azerbaijan, and Iran; southeast by Iraq; south by Syria and the Mediterranean Sea; and west by the Aegean Sea. Istanbul, which straddles Europe and Asia, is the country's largest city, while Ankara is the capital. Approximately 70 to 80 percent of the country's citizens are ethnic Turks, while the largest minority are Kurds at 20 percent.",

            "The United Kingdom of Great Britain and Northern Ireland, commonly known as the United Kingdom (UK or U.K.), or Britain,[note 10] is a sovereign country in north-western Europe, off the north-western coast of the European mainland. The United Kingdom includes the island of Great Britain, the north-eastern part of the island of Ireland, and many smaller islands within the British Isles. Northern Ireland shares a land border with the Republic of Ireland. Otherwise, the United Kingdom is surrounded by the Atlantic Ocean, with the North Sea to the east, the English Channel to the south and the Celtic Sea to the south-west, giving it the 12th-longest coastline in the world. The Irish Sea separates Great Britain and Ireland. The total area of the United Kingdom is 94,000 square miles (240,000 km2).",
    )

    private val countryImage = intArrayOf(R.drawable.canada, R.drawable.indonesia,
            R.drawable.japan, R.drawable.kenya, R.drawable.new_zealand,
            R.drawable.qatar, R.drawable.switzerland, R.drawable.thailand, R.drawable.turkey,
            R.drawable.united_kingdom)

    private val bigImage = intArrayOf(R.drawable.ottawa, R.drawable.jakarta, R.drawable.tokyo,
    R.drawable.nairobi, R.drawable.wellington, R.drawable.doha, R.drawable.bern, R.drawable.bangkok,
    R.drawable.ankara, R.drawable.london)

    private val motto = arrayOf(": A mari usque ad mare",
            ": Bhinneka Tunggal Ika",
            ": No official motto",
            ": Harambee",
            ": New Zealand (Coat of arms)",
            ": State of Qatar (Coat of arms)",
            ": Unus pro omnibus, omnes pro uno",
            ": Unofficically = Chat, Satsana, Phra Mahakasat",
            ": No official motto",
            ": No official motto")

    private val language = arrayOf(": English and French",
            ": Indonesian",
            ": Japanese",
            ": English and Swahili",
            ": English and Maori",
            ": Arabic",
            ": German, French, Italian, and Romansh",
            ": Thai",
            ": Turkish",
            ": English")

    private val gov = arrayOf(": Federal parliamentary",
            ": Constitutional Republic",
            ": Constitutional Monarchy",
            ": Constitutional Republic",
            ": Constitutional Monarchy",
            ": Constitutional Monarchy",
            ": Federal and Semi-Direct Democracy",
            ": Constitutional Monarchy",
            ": Constitutional Republic",
            ": Constitutional Monarchy")

    private val population = arrayOf(": 38,008,005",
            ": 270,203,917",
            ": 125,620,000",
            ": 47,564,296",
            ": 5,120,360",
            ": 2,795,484",
            ": 8,570,146",
            ": 66,558,935",
            ": 83,614,362",
            ": 67,886,004")

    private val currency = arrayOf(": Canadian dollar (CAD)",
            ": Indonesian Rupiah (IDR)",
            ": Japanese Yen (JPY)",
            ": Kenyan Shilling (KES)",
            ": New Zealand Dollar (NZD)",
            ": Qatari Riyal (QAR)",
            ": Swiss franc (CHF)",
            ": Baht (THB)",
            ": Turkish Lira (TRY)",
            ": Pound sterling (GBP)")


    val listData: ArrayList<DataModel>
        get() {
            val list = arrayListOf<DataModel>()
            for (position in countryName.indices) {
                list.add(DataModel(
                        bigImage[position],
                        countryName[position],
                        descriptionDetail[position],
                        countryImage[position],
                        motto[position],
                        countryDetail[position],
                        language[position],
                        gov[position],
                        population[position],
                        currency[position]
                ))
            }
            return list
        }
}
