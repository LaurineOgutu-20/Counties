package com.example.counties;

import java.util.ArrayList;
import java.util.List;

public class CountyRepository {

    public static List<County> getAllCounties() {
        List<County> list = new ArrayList<>();

        list.add(new County(
                1, "001", "Mombasa", "Mombasa City", "Coast",
                "Tourism, Shipping & Port Logistics, Trade, Fishing",
                "Fort Jesus, Nyali Beach, Old Town, Haller Park, Mombasa Marine Park",
                "Mombasa is Kenya's oldest and second-largest city, situated on a coastal island in the Indian Ocean. It is a major regional economic and cultural hub, famous for its historic Swahili architecture, sandy white beaches, Kilindini Seaport, and vibrant international tourism."
        ));

        list.add(new County(
                2, "002", "Kwale", "Kwale", "Coast",
                "Tourism, Agriculture (Coconuts, Cashews), Mining (Titanium)",
                "Diani Beach, Shimba Hills National Reserve, Kisite-Mpunguti Marine Park, Wasini Island",
                "Located in south-western Kenya, Kwale is world-famous for Diani Beach, renowned for its pristine white sands and turquoise waters. It features lush coastal rainforests, wildlife sanctuaries like Shimba Hills (home to the endangered Sable Antelope), and rich Swahili culture."
        ));

        list.add(new County(
                3, "003", "Kilifi", "Kilifi", "Coast",
                "Tourism, Agriculture (Cashews, Coconuts, Mangoes), Fishing",
                "Watamu Marine National Park, Malindi Town, Gedi Ruins, Arabuko Sokoke Forest, Marafa Depression",
                "Kilifi County stretches along Kenya's central coastline, encompassing historic resort towns like Malindi and Watamu. Known for its ancient Swahili heritage at Gedi Ruins, rich marine biodiversity, coral reefs, and the biodiversity hotspot Arabuko Sokoke Forest."
        ));

        list.add(new County(
                4, "004", "Tana River", "Hola", "Coast",
                "Pastoralism, Crop Farming, Fishing",
                "Tana River Primate National Reserve, Kora National Park, Tana Delta",
                "Named after Kenya's longest river, Tana River County features expansive riverine forests and coastal floodplains. It is home to unique endemic species such as the Tana River Red Colobus monkey and Crested Mangabey, supporting vibrant pastoralist and farming communities."
        ));

        list.add(new County(
                5, "005", "Lamu", "Lamu Town", "Coast",
                "Tourism, Fishing, Port Infrastructure (LAPSSET), Mangrove Harvesting",
                "Lamu Old Town (UNESCO World Heritage Site), Shela Beach, Takwa Ruins, Kiunga Marine Reserve",
                "Lamu is a tranquil archipelago steeped in Swahili history. Lamu Old Town is the oldest continually inhabited Swahili settlement in East Africa, featuring narrow streets, carved wooden doors, donkey transportation, and magnificent traditional coral stone architecture."
        ));

        list.add(new County(
                6, "006", "Taita-Taveta", "Mwatate", "Coast",
                "Wildlife Tourism, Gemstone Mining, Agriculture",
                "Tsavo East National Park, Tsavo West National Park, Taita Hills, Lake Chala, Mzima Springs",
                "Taita-Taveta is the gateway to Kenya's largest national park complex, Tsavo. Renowned for its iconic red-elephant herds, dramatic volcanic landscapes, crystal-clear Mzima Springs, and lush cloud forests atop the scenic Taita Hills."
        ));

        list.add(new County(
                7, "007", "Garissa", "Garissa", "North Eastern",
                "Livestock Farming, Trade, Agriculture along Tana River",
                "Bour-Algi Giraffe Sanctuary, Arawale National Reserve, Tana River Ecosystem",
                "Garissa County is a vital commercial hub in north-eastern Kenya. Predominantly inhabited by pastoralist communities, the county is famous for its vibrant livestock markets and conservation efforts for rare species such as the Hirola (Hunter's Hartebeest) and reticulated giraffes."
        ));

        list.add(new County(
                8, "008", "Wajir", "Wajir", "North Eastern",
                "Pastoralism, Commerce, Camel Husbandry",
                "Wajir Museum, Yahya Palace, Wagalla Memorial Monument, Historic Bunkers",
                "Located in northeastern Kenya, Wajir is known for its vast arid landscapes, rich Somali cultural heritage, historical colonial fortifications, and vital role in camel and cattle pastoralism in the region."
        ));

        list.add(new County(
                9, "009", "Mandera", "Mandera", "North Eastern",
                "Livestock Rearing, Cross-Border Trade, Crop Farming along River Daua",
                "River Daua, Malka Mari National Park, Border Tri-point (Kenya-Ethiopia-Somalia)",
                "Situated at the northernmost point of Kenya bordering Ethiopia and Somalia, Mandera is defined by the scenic Daua River, rich traditional heritage, trade routes, and rugged dryland wilderness."
        ));

        list.add(new County(
                10, "010", "Marsabit", "Marsabit", "Eastern",
                "Pastoralism, Eco-Tourism, Fishing (Lake Turkana)",
                "Lake Paradise, Marsabit National Park, Lake Turkana (Jade Sea), Chalbi Desert, Mount Kulal",
                "Kenya's largest county by land area, Marsabit features extraordinary geographic diversity—from the stark sands of Chalbi Desert to the lush crater lakes of Mount Marsabit, known historically for giant tusker elephants like Ahmed of Marsabit."
        ));

        list.add(new County(
                11, "011", "Isiolo", "Isiolo", "Eastern",
                "Tourism, Pastoralism, LAPSSET Corridor Hub",
                "Samburu National Reserve, Buffalo Springs Reserve, Shaba National Reserve",
                "Known as the heart of northern Kenya, Isiolo serves as a major transit center. It hosts world-class wildlife reserves along the Ewaso Nyiro River, home to the 'Special Five' northern wildlife species (Grevy's Zebra, Somalian Ostrich, Reticulated Giraffe, Beisa Oryx, Gerenuk)."
        ));

        list.add(new County(
                12, "012", "Meru", "Meru", "Eastern",
                "Commercial Agriculture (Miraa, Tea, Coffee, Bananas), Eco-Tourism",
                "Meru National Park, Mount Kenya National Park, Meru Museum, Giitune Sacred Forest",
                "Situated on the fertile eastern slopes of Mount Kenya, Meru is an agricultural powerhouse celebrated for its lush greenery, coffee and tea plantations, miraa farming, and wild game drives in Meru National Park (made famous by Elsa the Lioness)."
        ));

        list.add(new County(
                13, "013", "Tharaka-Nithi", "Kathwana", "Eastern",
                "Agriculture (Millet, Sorghum, Tea, Coffee), Mining",
                "Mount Kenya Climbing Routes (Chogoria Route), Ura Gate, Meru South Forest",
                "Home to the scenic Chogoria climbing route up Mount Kenya, Tharaka-Nithi is famous for its stunning waterfalls, deep gorges, agricultural diversity, and warm cultural heritage."
        ));

        list.add(new County(
                14, "014", "Embu", "Embu", "Eastern",
                "Tea & Coffee Farming, Macadamia Production, Hydroelectric Power Generation",
                "Mount Kenya, Karue Hill, Mwea National Reserve, Seven Forks Hydroelectric Dams",
                "Located on the south-eastern slopes of Mount Kenya, Embu is known as a green county with fertile soils, major tea and macadamia plantations, and scenic hills offering panoramic views over Central Kenya."
        ));

        list.add(new County(
                15, "015", "Kitui", "Kitui", "Eastern",
                "Agriculture, Coal Mining, Honey Production, Handcrafts",
                "Mutomo Hill Plant Sanctuary, Nzambani Rock, Tsavo East National Park (Northern Border)",
                "Kitui County is renowned for its iconic landscape features like the towering single-standing Nzambani Rock, rich Akamba artisan wood carving heritage, mineral wealth, and eco-tourism reserves."
        ));

        list.add(new County(
                16, "016", "Machakos", "Machakos", "Eastern",
                "Commercial Industry, Real Estate, Agriculture, Tourism",
                "Machakos People's Park, Ol Donyo Sabuk National Park, Kyamwilu Gravity Hill, Lukenya Hills",
                "Neighboring Nairobi, Machakos is a rapidly growing economic and leisure hub featuring recreational parks, the mysterious gravity-defying hill at Kyamwilu, and scenic mountain ranges ideal for hiking and rock climbing."
        ));

        list.add(new County(
                17, "017", "Makueni", "Wote", "Eastern",
                "Fruit Farming (Mangoes, Citrus), Pastoralism, Agro-Processing",
                "Chyulu Hills National Park, Kibwezi Forest, Hunters Cave, Nzaui Hill",
                "Makueni County is widely celebrated for its successful fruit farming initiatives (especially delicious mangoes), as well as the surreal, verdant rolling green landscapes of Chyulu Hills—which inspired Ernest Hemingway's 'Green Hills of Africa'."
        ));

        list.add(new County(
                18, "018", "Nyandarua", "Ol Kalou", "Central",
                "Potato Farming, Dairy Production, Horticulture",
                "Aberdare National Park, Lake Ol Bolossat, Kinangop Plateau, Elephant Hill",
                "Situated along the majestic Aberdare Mountain Range, Nyandarua is Kenya's primary potato and dairy producing county. It boasts cool mountain climates, Lake Ol Bolossat (Central Kenya's only natural lake), and spectacular hiking trails."
        ));

        list.add(new County(
                19, "019", "Nyeri", "Nyeri", "Central",
                "Coffee & Tea Farming, Eco-Tourism, Commercial Trade",
                "Aberdare National Park, Mount Kenya, Baden-Powell Historical Grave & Museum, Treetops Hotel",
                "Steeped in rich history, Nyeri served as a center for the Mau Mau freedom movement and is the final resting place of Lord Baden-Powell (founder of the Boy Scouts) and Nobel Laureate Wangari Maathai's home region. It features historic lodges where Queen Elizabeth II acceded to the throne."
        ));

        list.add(new County(
                20, "020", "Kirinyaga", "Kerugoya / Kutus", "Central",
                "Rice Farming (Mwea Scheme), Tea, Coffee, Milling",
                "Mount Kenya Climbing Routes (Castle Forest Lodge), Mwea Rice Fields, Sagana River Rafting",
                "Kirinyaga is famous for hosting the massive Mwea Irrigation Scheme, producing the bulk of Kenya's aromatic Pishori rice. It features roaring rivers popular for white-water rafting and dense Mount Kenya rain forests."
        ));

        list.add(new County(
                21, "021", "Murang'a", "Murang'a", "Central",
                "Tea & Coffee Farming, Avocado Exports, Dairy Farming",
                "Mukurwe wa Nyagathanga, Aberdare Forest, Ndakaini Dam",
                "Considered the ancestral birthplace of the Kikuyu people at Mukurwe wa Nyagathanga, Murang'a is characterized by picturesque terraced tea and coffee farms, avocado orchards, and Ndakaini Dam—the main water source for Nairobi."
        ));

        list.add(new County(
                22, "022", "Kiambu", "Kiambu", "Central",
                "Real Estate, Industrial Manufacturing, Coffee & Tea Estates, Agriculture",
                "Fourteen Falls (Thika), Paradise Lost (Kiambu), Great Rift Valley Viewpoint, Blue Post Hotel",
                "Bordering Nairobi, Kiambu is one of Kenya's wealthiest and fastest-urbanizing counties. It seamlessly combines vast historic coffee and tea plantations with modern industrial hubs, residential suburbs, and picturesque tourist spots like Fourteen Falls."
        ));

        list.add(new County(
                23, "023", "Turkana", "Lodwar", "Rift Valley",
                "Oil & Mineral Exploration, Fishing (Lake Turkana), Pastoralism",
                "Lake Turkana (UNESCO Site), Central Island National Park, Eliye Springs, Nariokotome Site",
                "Known as the 'Cradle of Humankind' where the famous 1.5-million-year-old fossil 'Turkana Boy' was discovered. Turkana surrounds the breathtaking turquoise waters of Lake Turkana, the world's largest permanent desert lake."
        ));

        list.add(new County(
                24, "024", "West Pokot", "Kapenguria", "Rift Valley",
                "Livestock Rearing, Agriculture, Mining",
                "Kapenguria Museum (Kapenguria Six Jail), Cherang'any Hills, Turkwel Hydroelectric Dam",
                "Famous for its historic Kapenguria Six museum where Kenya's founding father Jomo Kenyatta and fellow freedom fighters were tried. West Pokot features dramatic mountain ranges, Cherang'any forest reserves, and vibrant cultural traditions."
        ));

        list.add(new County(
                25, "025", "Samburu", "Maralal", "Rift Valley",
                "Wildlife Tourism, Pastoralism, Cultural Preservation",
                "Samburu National Reserve, Maralal Camel Derby, Mount Ololokwe, Loroki Plateau",
                "Renowned for its pristine wild landscapes, vibrant Samburu warrior culture, the iconic flat-topped sacred mountain Ololokwe, and the annual international Maralal Camel Derby."
        ));

        list.add(new County(
                26, "026", "Trans-Nzoia", "Kitale", "Rift Valley",
                "Commercial Maize Farming, Seed Production, Dairy Farming",
                "Saiwa Swamp National Park, Mount Elgon National Park, Kitale Museum",
                "Known as Kenya's breadbasket due to its massive maize production, Trans-Nzoia is home to Saiwa Swamp National Park—the smallest national park in Kenya, created specifically to protect the rare aquatic Sitatunga antelope."
        ));

        list.add(new County(
                27, "027", "Uasin Gishu", "Eldoret", "Rift Valley",
                "Commercial Agriculture (Wheat, Maize), Athletics Training, Education & Medical Services",
                "Eldoret Town (City of Champions), Koromosho Falls, Chepkiit Waterfalls, Sergoit Hill",
                "Globally renowned as the 'City of Champions', Eldoret in Uasin Gishu County is the high-altitude training ground for Kenya's world-record-breaking distance runners, alongside being a premier agricultural and commercial center."
        ));

        list.add(new County(
                28, "028", "Elgeyo-Marakwet", "Iten", "Rift Valley",
                "Athletics High-Altitude Training, Agriculture, Eco-Tourism",
                "Iten Viewpoint (Home of Champions), Kerio Valley, Rimoi National Reserve, Torok Falls",
                "Perched dramatically on the edge of the Elgeyo Escarpment overlooking Kerio Valley, Iten is the world epicenter of elite marathon runners. The county boasts breathtaking valley views and the Rimoi reserve famous for large elephant herds."
        ));

        list.add(new County(
                29, "029", "Nandi", "Kapsabet", "Rift Valley",
                "Tea Farming, Dairy Production, Athletics Training",
                "Nandi Hills, Koitalel Arap Samoei Museum, Tinderet Forest, Kingwal Swamp",
                "Famous for its rolling emerald-green tea hills and cool highlands. Nandi holds rich historical significance as the home of legendary leader Koitalel Arap Samoei, as well as breeding world-renowned athletic talent."
        ));

        list.add(new County(
                30, "030", "Baringo", "Kabarnet", "Rift Valley",
                "Pastoralism, Honey Production, Eco-Tourism, Geothermal Energy",
                "Lake Baringo, Lake Bogoria (Hot Springs & Flamingos), Lake Kamnarok, Tugumoi Ridge",
                "Famous for Lake Bogoria's natural geysers, boiling hot springs, and millions of lesser flamingos turning the shore pink. Lake Baringo provides a freshwater haven for hippos, crocodiles, and over 400 bird species."
        ));

        list.add(new County(
                31, "031", "Laikipia", "Rumuruti / Nanyuki", "Rift Valley",
                "Eco-Tourism Conservancies, Ranching, Horticulture",
                "Ol Pejeta Conservancy, Lewa Wildlife Conservancy, Mount Kenya view, Thomson's Falls",
                "Laikipia is Kenya's premier private wildlife conservation haven, home to the highest density of black rhinos in East Africa at Ol Pejeta (and the last remaining northern white rhinos), as well as luxury game ranches."
        ));

        list.add(new County(
                32, "032", "Nakuru", "Nakuru City", "Rift Valley",
                "Tourism, Commercial Agriculture, Geothermal Energy (Olkaria), Manufacturing",
                "Lake Nakuru National Park, Menengai Crater, Lake Naivasha, Hell's Gate National Park, Hyrax Hill",
                "Nakuru is Kenya's newest officially chartered city. It features famous geological wonders like Menengai Crater (one of the largest extinct calderas in the world), Hell's Gate National Park (inspiration for The Lion King), and flamingo-filled Lake Nakuru."
        ));

        list.add(new County(
                33, "033", "Narok", "Narok", "Rift Valley",
                "Wildlife Tourism, Wheat Farming, Maasai Cultural Tourism",
                "Maasai Mara National Reserve, Mau Forest, Loita Hills, Suswa Crater",
                "World-famous as the home of the iconic Maasai Mara National Reserve, site of the Eighth Wonder of the Natural World—the Great Wildebeest Migration. Narok is the heartland of Maasai culture and vast savannah plains."
        ));

        list.add(new County(
                34, "034", "Kajiado", "Kajiado", "Rift Valley",
                "Tourism, Real Estate, Pastoralism, Mining (Soda Ash at Lake Magadi)",
                "Amboseli National Park, Lake Magadi, Ngong Hills, Kitengela Glass, Olorgesailie Site",
                "Celebrated for Amboseli National Park with its world-famous views of Mount Kilimanjaro framing herds of free-roaming elephants. Kajiado also features the scenic Ngong Hills and the pink soda ash waters of Lake Magadi."
        ));

        list.add(new County(
                35, "035", "Kericho", "Kericho", "Rift Valley",
                "Tea Farming & Export, Agriculture, Eco-Tourism",
                "Kericho Tea Plantations, Chinga Dam, Mau Forest Complex, Tagabi Sanctuary",
                "Known nationwide and internationally as the Tea Capital of Kenya. Kericho boasts magnificent carpet-like rolling green tea estates stretching as far as the eye can see, benefiting from warm weather and constant rainfall."
        ));

        list.add(new County(
                36, "036", "Bomet", "Bomet", "Rift Valley",
                "Tea Farming, Dairy Production, Horticulture",
                "Tenwek Waterfalls, Mara River Tributaries, Kipsegon Ecosystem",
                "Bomet County is located in the high-potential agricultural zone of South Rift, renowned for vibrant tea plantations, dairy farming, and scenic riverside landscapes along the Mara River tributaries."
        ));

        list.add(new County(
                37, "037", "Kakamega", "Kakamega", "Western",
                "Agriculture (Sugarcane, Maize), Gold Mining, Eco-Tourism",
                "Kakamega Forest Reserve (Equatorial Rainforest), Crying Stone of Ilesi, Rosterman Mines",
                "Home to the magnificent Kakamega Forest, the easternmost remnant of the ancient Guineo-Congolian equatorial rainforest, rich in unique primates, butterflies, and rare birds. Also famous for the mysterious 'Crying Stone of Ilesi'."
        ));

        list.add(new County(
                38, "038", "Vihiga", "Mbale", "Western",
                "Farming (Tea, Maize, Beans), Quarrying, Commerce",
                "Maragoli Hills, Mungoma Caves, Kaimosi Forest",
                "Vihiga is one of Kenya's most densely populated counties, blessed with lush green granite hills, cool climate, and rich Maragoli cultural heritage nestled within Western Kenya."
        ));

        list.add(new County(
                39, "039", "Bungoma", "Bungoma", "Western",
                "Sugarcane Farming, Agriculture, Trade",
                "Mount Elgon National Park, Kitum Elephant Cave, Chetambe Fort, Sang'alo Rocks",
                "Situated on the slopes of Mount Elgon, Bungoma is famed for Mount Elgon's unique salt-mining elephant caves (Kitum Cave), historical Chetambe Fort, and vibrant agricultural economy."
        ));

        list.add(new County(
                40, "040", "Busia", "Busia", "Western",
                "Cross-Border Trade (Uganda Border), Fishing, Agriculture",
                "Lake Victoria Shoreline, Kakapel Rock Art Site, Samia Hills",
                "Busia serves as Kenya's gateway to East & Central Africa via two busy border crossings into Uganda. It offers scenic Lake Victoria views and ancient rock art at Kakapel National Monument."
        ));

        list.add(new County(
                41, "041", "Siaya", "Siaya", "Nyanza",
                "Fishing, Agriculture, Heritage Tourism",
                "Kogelo (Ancestral home of Barack Obama), Lake Kanyaboli, Got Ramogi Hill, Yala Swamp",
                "Famous worldwide as the ancestral home of former US President Barack Obama at Nyang'oma Kogelo. Siaya is rich in Luo cultural heritage, scenic Lake Kanyaboli oxbow lake, and vibrant Lake Victoria fisheries."
        ));

        list.add(new County(
                42, "042", "Kisumu", "Kisumu City", "Nyanza",
                "Port Logistics & Trade, Fishing, Tourism, Sugar Milling",
                "Kisumu Impala Sanctuary, Dunga Hill Camp, Kit Mikayi, Hippo Point, Lake Victoria Port",
                "Kisumu is Kenya's third-largest city and the principal port city on Lake Victoria (the world's second-largest freshwater lake). Famous for its fresh tilapia delicacies, gorgeous lakeside sunsets, and the iconic Kit Mikayi rock formation."
        ));

        list.add(new County(
                43, "043", "Homa Bay", "Homa Bay", "Nyanza",
                "Fishing, Agriculture, Island Tourism",
                "Ruma National Park (Home of the Roan Antelope), Rusinga Island, Mfangano Island, Homa Hills",
                "Homa Bay boasts extensive shores on Lake Victoria and picturesque tropical islands like Rusinga and Mfangano. Ruma National Park is Kenya's last remaining sanctuary for the majestic endangered Roan Antelope."
        ));

        list.add(new County(
                44, "044", "Migori", "Migori", "Nyanza",
                "Agriculture (Tobacco, Sugarcane), Gold Mining, Border Trade",
                "Thimlich Ohinga Archaeological Site (UNESCO World Heritage), Lake Victoria Beaches",
                "Migori is home to Thimlich Ohinga, a UNESCO World Heritage site featuring complex dry-stone walled architectural structures built in the 16th century. The county connects Kenya to Tanzania via Isebania border."
        ));

        list.add(new County(
                45, "045", "Kisii", "Kisii", "Nyanza",
                "Soapstone Carving, Agriculture (Bananas, Tea, Coffee), Commerce",
                "Tabaka Soapstone Quarries, Manga Ridge, Sameta Hill",
                "Located in the fertile Gusii highlands, Kisii is world-renowned for Tabaka Soapstone carvings—handcrafted intricate stone sculptures exported worldwide. It is also famous for its lush banana hills and high agricultural productivity."
        ));

        list.add(new County(
                46, "046", "Nyamira", "Nyamira", "Nyanza",
                "Tea Farming, Horticulture, Dairy Farming",
                "Manga Ridge, Kiabonyonyi Hill, Kebirigo Tea Estates",
                "Nyamira features cool highland weather with undulating hills blanketed in green tea plantations, picturesque river valleys, and rich Gusii culture."
        ));

        list.add(new County(
                47, "047", "Nairobi City", "Nairobi City", "Nairobi",
                "Commerce, Financial Services, Technology, Government, Global Diplomacy",
                "Nairobi National Park, Giraffe Centre, Sheldrick Elephant Orphanage, National Museum, Karura Forest",
                "Nairobi is Kenya's cosmopolitan capital city and the economic & diplomatic hub of East Africa. Known uniquely as the 'Green City in the Sun', it is the only city in the world with a game reserve national park right against its skyline!"
        ));

        return list;
    }

    public static County getCountyById(int id) {
        for (County county : getAllCounties()) {
            if (county.getId() == id) {
                return county;
            }
        }
        return getAllCounties().get(0);
    }
}
