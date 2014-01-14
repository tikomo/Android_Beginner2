Androidのdpiについて

dpi(Dot Per Inch) 1インチ辺りのピクセル数。dpi数値が高くなるとディスプレイが綺麗になる。

ldpi(低解像度)　120dpi
mdpi(中解像度) 160dpi
hdpi(高解像度) 240dpi
xhdpi(超高解像度) 320dpi
xxhdpi(超超高解像度) 480dpi

Nexus7(2012)は1280×800の216dpi
Nexus7(2013)は1920×1200の323dpi

Nexus7(2012)なんでhdpiの画像を使う。

http://spdesign.exblog.jp/19798730/　の人のようなイメージは正しい。
だから、Nexus7(2012)は hdpi を使うのも正しいんだけど、横が800もあるので540の画像だと合わない

mdpi（160dpi）		baseline	360×640px	320×480px、320×432pxなど
hdpi（240dpi）　	1.5x		540×960px	480×800px、480×854pxなど
xhdpi（320dpi）	2x			720×1280px	640×960pxなど
xxhdpi（480dpi）	3x			1080×1920px	 

でも、Nexus7用に-tvdpiってのが用意されているので、そのフォルダを作成し、横800でデザインした画像を入れとく、

これで、Nexus7(2013)もここを使うようになるんだっけ

縦のサイズは各端末で微妙な感じなので、縦のデザインは多少上下してもよさそうなものにしておくこと
