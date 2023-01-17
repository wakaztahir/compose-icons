package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Yolo: ImageVector
    get() {
        if (_yolo != null) {
            return _yolo!!
        }
        _yolo = Builder(name = "Yolo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 8.2577f)
                curveToRelative(0.0392f, -0.2067f, 0.1406f, -0.3965f, 0.2905f, -0.5442f)
                curveToRelative(0.1364f, -0.1504f, 0.3292f, -0.2373f, 0.5323f, -0.2399f)
                curveToRelative(0.5561f, -0.0078f, 1.1122f, -0.0153f, 1.6684f, -0.0225f)
                curveToRelative(0.4245f, -0.0058f, 0.8491f, -0.0119f, 1.2736f, -0.0181f)
                curveToRelative(0.287f, -0.0042f, 0.5739f, -0.0133f, 0.8609f, -0.0126f)
                curveToRelative(0.4662f, 0.0035f, 0.8413f, 0.3842f, 0.8378f, 0.8503f)
                curveToRelative(-0.001f, 0.1398f, -0.0368f, 0.2771f, -0.104f, 0.3996f)
                curveToRelative(-0.0847f, 0.1508f, -0.1871f, 0.2932f, -0.2569f, 0.4503f)
                curveToRelative(-0.1391f, 0.3003f, -0.1393f, 0.6465f, -5.0E-4f, 0.947f)
                curveToRelative(0.0095f, 0.0218f, 0.0202f, 0.0432f, 0.0319f, 0.064f)
                curveToRelative(0.004f, 0.007f, 0.0132f, 0.011f, 0.0248f, 0.0202f)
                curveToRelative(0.0138f, -0.0146f, 0.0263f, -0.0304f, 0.0372f, -0.0472f)
                curveToRelative(0.2515f, -0.4685f, 0.4705f, -0.9537f, 0.6554f, -1.4522f)
                curveToRelative(0.0957f, -0.2658f, 0.0546f, -0.488f, -0.132f, -0.6843f)
                curveToRelative(-0.1807f, -0.1902f, -0.3775f, -0.3649f, -0.5598f, -0.5536f)
                curveToRelative(-0.1249f, -0.1232f, -0.2392f, -0.2568f, -0.3416f, -0.3993f)
                curveToRelative(-0.1515f, -0.2068f, -0.1412f, -0.4906f, 0.0248f, -0.6859f)
                curveToRelative(0.228f, -0.2994f, 0.5304f, -0.4734f, 0.9224f, -0.457f)
                curveToRelative(0.2479f, 0.0104f, 0.496f, 0.0159f, 0.744f, 0.024f)
                curveToRelative(0.7289f, 0.0239f, 1.4578f, 0.0478f, 2.1867f, 0.0719f)
                curveToRelative(0.3854f, 0.0126f, 0.7709f, 0.0215f, 1.1561f, 0.0381f)
                curveToRelative(0.2984f, 0.0129f, 0.767f, 0.3339f, 0.7513f, 0.7706f)
                curveToRelative(-0.0038f, 0.1159f, -0.0136f, 0.2314f, -0.0293f, 0.3463f)
                curveToRelative(-0.0074f, 0.0526f, 0.004f, 0.0743f, 0.0545f, 0.0753f)
                curveToRelative(0.0658f, 0.0014f, 0.1316f, 0.0023f, 0.1974f, 0.0015f)
                curveToRelative(0.823f, -0.0109f, 1.5311f, 0.2803f, 2.1419f, 0.8195f)
                curveToRelative(0.0698f, 0.0738f, 0.1695f, 0.1117f, 0.2707f, 0.103f)
                curveToRelative(0.0793f, -0.008f, 0.1601f, -0.0016f, 0.2479f, -0.0016f)
                curveToRelative(-4.0E-4f, -0.0234f, -0.0035f, -0.0467f, -0.0092f, -0.0695f)
                curveToRelative(-0.1302f, -0.3136f, -0.3149f, -0.5796f, -0.621f, -0.752f)
                curveToRelative(-0.0954f, -0.0606f, -0.1809f, -0.1354f, -0.2535f, -0.2219f)
                curveToRelative(-0.0846f, -0.0924f, -0.1617f, -0.1914f, -0.2306f, -0.296f)
                curveToRelative(-0.1364f, -0.1853f, -0.1381f, -0.4373f, -0.0044f, -0.6245f)
                curveToRelative(0.2114f, -0.3412f, 0.5959f, -0.5354f, 0.996f, -0.5032f)
                curveToRelative(0.3074f, 0.0164f, 0.6155f, 0.0195f, 0.9233f, 0.0282f)
                curveToRelative(0.6574f, 0.0185f, 1.3147f, 0.037f, 1.972f, 0.0554f)
                curveToRelative(0.3794f, 0.0109f, 0.7588f, 0.0228f, 1.1382f, 0.0357f)
                curveToRelative(0.1494f, 8.0E-4f, 0.2986f, 0.0095f, 0.447f, 0.0262f)
                curveToRelative(0.3453f, 0.0495f, 0.6099f, 0.4042f, 0.6206f, 0.7571f)
                curveToRelative(0.0158f, 0.1939f, -0.0112f, 0.3889f, -0.079f, 0.5712f)
                curveToRelative(-0.0811f, 0.1904f, -0.2448f, 0.3333f, -0.4445f, 0.3877f)
                curveToRelative(-0.2179f, 0.0561f, -0.4214f, 0.1579f, -0.597f, 0.2985f)
                curveToRelative(-0.0943f, 0.0829f, -0.1755f, 0.1807f, -0.2626f, 0.2718f)
                lineToRelative(0.0186f, 0.029f)
                curveToRelative(0.034f, 0.0021f, 0.068f, 0.0059f, 0.102f, 0.0059f)
                curveToRelative(0.2662f, 5.0E-4f, 0.5325f, -0.0022f, 0.7987f, 0.0018f)
                curveToRelative(0.0715f, 0.003f, 0.141f, -0.0239f, 0.1919f, -0.0742f)
                curveToRelative(0.4216f, -0.3998f, 0.9475f, -0.6725f, 1.5172f, -0.7866f)
                curveToRelative(1.0276f, -0.1971f, 1.9473f, 0.0544f, 2.7495f, 0.7162f)
                curveToRelative(0.7651f, 0.6312f, 1.2138f, 1.4569f, 1.4243f, 2.4163f)
                curveToRelative(0.0465f, 0.2119f, 0.0632f, 0.4302f, 0.0946f, 0.6455f)
                curveToRelative(0.0042f, 0.0291f, 0.0139f, 0.0574f, 0.0211f, 0.0861f)
                verticalLineToRelative(0.6095f)
                curveToRelative(-0.0198f, 0.1474f, -0.0355f, 0.2954f, -0.0599f, 0.442f)
                curveToRelative(-0.2029f, 1.2203f, -0.7496f, 2.2351f, -1.7918f, 2.9434f)
                curveToRelative(-0.5729f, 0.3916f, -1.2582f, 0.5849f, -1.9513f, 0.5504f)
                curveToRelative(-0.1191f, -0.0045f, -0.238f, -0.0211f, -0.3564f, -0.0369f)
                curveToRelative(-0.0587f, -0.0078f, -0.0764f, 0.017f, -0.0745f, 0.0687f)
                curveToRelative(0.0142f, 0.3817f, 0.0261f, 0.7635f, 0.0435f, 1.1451f)
                curveToRelative(0.0164f, 0.3588f, -0.1294f, 0.7578f, -0.5291f, 0.9213f)
                curveToRelative(-0.1774f, 0.0749f, -0.3677f, 0.1147f, -0.5602f, 0.1173f)
                curveToRelative(-0.6186f, 0.0095f, -1.2374f, 0.0219f, -1.8553f, 0.0507f)
                curveToRelative(-0.6594f, 0.0307f, -1.3181f, 0.0795f, -1.9768f, 0.1239f)
                curveToRelative(-0.3576f, 0.0241f, -0.7144f, 0.0675f, -1.0722f, 0.0772f)
                curveToRelative(-0.14f, -0.0046f, -0.2773f, -0.0396f, -0.4024f, -0.1025f)
                curveToRelative(-0.194f, -0.0819f, -0.3623f, -0.2147f, -0.4869f, -0.3844f)
                curveToRelative(-0.1566f, -0.2016f, -0.1637f, -0.4818f, -0.0174f, -0.691f)
                curveToRelative(0.4022f, -0.6254f, 0.7337f, -1.2848f, 0.8901f, -2.0202f)
                curveToRelative(0.068f, -0.3196f, 0.0398f, -0.6424f, 0.0465f, -0.9642f)
                curveToRelative(0.0013f, -0.0615f, 2.0E-4f, -0.123f, 2.0E-4f, -0.1845f)
                lineToRelative(-0.0238f, -0.0076f)
                curveToRelative(-0.0204f, 0.0303f, -0.0421f, 0.0598f, -0.061f, 0.0909f)
                curveToRelative(-0.435f, 0.7153f, -1.0138f, 1.2747f, -1.8052f, 1.5726f)
                curveToRelative(-1.2006f, 0.4518f, -2.3029f, 0.2361f, -3.2808f, -0.5751f)
                curveToRelative(-0.7783f, -0.6456f, -1.2136f, -1.5003f, -1.4176f, -2.4801f)
                curveToRelative(-0.0109f, -0.0525f, -0.0208f, -0.1052f, -0.0322f, -0.1576f)
                curveToRelative(-0.0057f, -0.0159f, -0.0126f, -0.0312f, -0.0206f, -0.046f)
                curveToRelative(-0.0211f, 0.038f, -0.038f, 0.0646f, -0.0513f, 0.0928f)
                curveToRelative(-0.1299f, 0.2756f, -0.2614f, 0.5504f, -0.3868f, 0.828f)
                curveToRelative(-0.026f, 0.0596f, -0.0397f, 0.1238f, -0.04f, 0.1888f)
                curveToRelative(-0.0031f, 0.5287f, 0.0019f, 1.0575f, -0.0035f, 1.5862f)
                curveToRelative(-0.0036f, 0.206f, 0.0845f, 0.403f, 0.2405f, 0.5377f)
                curveToRelative(0.1648f, 0.1488f, 0.3571f, 0.2641f, 0.566f, 0.3395f)
                curveToRelative(0.3633f, 0.1386f, 0.5533f, 0.559f, 0.5517f, 0.8511f)
                curveToRelative(-0.0016f, 0.3025f, -0.3426f, 0.7261f, -0.6649f, 0.7972f)
                curveToRelative(-1.3829f, 0.3049f, -2.765f, 0.6131f, -4.1464f, 0.9247f)
                curveToRelative(-0.4462f, 0.1001f, -1.0391f, -0.3284f, -0.9992f, -0.8247f)
                curveToRelative(0.0285f, -0.3535f, 0.1539f, -0.6456f, 0.4984f, -0.8331f)
                curveToRelative(0.5901f, -0.3213f, 0.9143f, -0.8506f, 1.0587f, -1.4948f)
                curveToRelative(0.1007f, -0.4492f, -0.0048f, -0.8768f, -0.1546f, -1.2979f)
                curveToRelative(-0.187f, -0.5258f, -0.4532f, -1.0134f, -0.7249f, -1.4984f)
                curveToRelative(-0.4088f, -0.7298f, -0.8144f, -1.4613f, -1.2251f, -2.1899f)
                curveToRelative(-0.1421f, -0.2521f, -0.3578f, -0.4405f, -0.5849f, -0.6118f)
                curveToRelative(-0.2099f, -0.1635f, -0.4293f, -0.3142f, -0.6572f, -0.4515f)
                curveToRelative(-0.2635f, -0.1532f, -0.392f, -0.3827f, -0.4562f, -0.6644f)
                curveTo(0.0183f, 8.4396f, 0.0084f, 8.4116f, 0.0f, 8.3832f)
                verticalLineToRelative(-0.1255f)
                close()
                moveTo(7.4194f, 11.0558f)
                curveToRelative(0.0088f, 0.1617f, 0.0206f, 0.3002f, 0.0232f, 0.439f)
                curveToRelative(0.0049f, 0.3646f, 0.054f, 0.7273f, 0.146f, 1.0801f)
                curveToRelative(0.2375f, 0.8962f, 0.6865f, 1.659f, 1.4402f, 2.2193f)
                curveToRelative(0.587f, 0.4542f, 1.3274f, 0.6627f, 2.0651f, 0.5817f)
                curveToRelative(0.6327f, -0.0687f, 1.2271f, -0.3373f, 1.6969f, -0.7667f)
                curveToRelative(0.5012f, -0.4495f, 0.8764f, -1.0219f, 1.0888f, -1.6608f)
                curveToRelative(0.0737f, -0.2102f, 0.1516f, -0.4189f, 0.2275f, -0.6283f)
                lineToRelative(0.0169f, 0.0031f)
                verticalLineToRelative(0.0591f)
                curveToRelative(-1.0E-4f, 0.717f, 0.0012f, 1.434f, -0.0016f, 2.151f)
                curveToRelative(1.0E-4f, 0.1194f, -0.0099f, 0.2385f, -0.0298f, 0.3562f)
                curveToRelative(-0.1411f, 0.8085f, -0.5066f, 1.524f, -0.9325f, 2.2129f)
                curveToRelative(-0.0998f, 0.1615f, -0.1113f, 0.2475f, 0.0085f, 0.3972f)
                curveToRelative(0.1972f, 0.2527f, 0.5117f, 0.3846f, 0.8302f, 0.3485f)
                curveToRelative(0.1967f, -0.0137f, 0.393f, -0.0336f, 0.5898f, -0.0465f)
                curveToRelative(0.5905f, -0.0388f, 1.1807f, -0.0837f, 1.7718f, -0.1112f)
                curveToRelative(0.7793f, -0.0363f, 1.5591f, -0.0615f, 2.3389f, -0.0842f)
                curveToRelative(0.1596f, -0.0034f, 0.3173f, -0.036f, 0.4652f, -0.096f)
                curveToRelative(0.2626f, -0.1051f, 0.3683f, -0.3496f, 0.3622f, -0.6022f)
                curveToRelative(-0.0096f, -0.3999f, -0.0292f, -0.7995f, -0.0432f, -1.1993f)
                curveToRelative(-0.004f, -0.1134f, -6.0E-4f, -0.2271f, -0.0052f, -0.3405f)
                curveToRelative(-0.0033f, -0.0804f, 0.0292f, -0.1036f, 0.103f, -0.0791f)
                curveToRelative(0.017f, 0.0056f, 0.0347f, 0.0091f, 0.0521f, 0.0135f)
                curveToRelative(0.4976f, 0.1304f, 1.0215f, 0.1219f, 1.5146f, -0.0244f)
                curveToRelative(0.8154f, -0.2406f, 1.4319f, -0.7474f, 1.8806f, -1.4545f)
                curveToRelative(0.6527f, -1.0283f, 0.8286f, -2.1505f, 0.5868f, -3.3364f)
                curveToRelative(-0.184f, -0.9021f, -0.6039f, -1.6792f, -1.3173f, -2.2757f)
                curveToRelative(-0.7367f, -0.6161f, -1.5828f, -0.8604f, -2.535f, -0.6735f)
                curveToRelative(-0.5545f, 0.1157f, -1.0626f, 0.3921f, -1.461f, 0.7947f)
                curveToRelative(-0.046f, 0.0474f, -0.11f, 0.0729f, -0.176f, 0.0701f)
                curveToRelative(-0.1944f, -0.0025f, -0.3889f, -7.0E-4f, -0.5834f, -7.0E-4f)
                curveToRelative(-0.2782f, -0.0f, -0.5564f, -2.0E-4f, -0.8346f, -6.0E-4f)
                curveToRelative(-0.0505f, -1.0E-4f, -0.1047f, 0.0012f, -0.0688f, -0.0783f)
                curveToRelative(0.1049f, -0.2519f, 0.2602f, -0.4796f, 0.4564f, -0.6692f)
                curveToRelative(0.2163f, -0.1905f, 0.4731f, -0.3292f, 0.751f, -0.4057f)
                curveToRelative(0.1241f, -0.03f, 0.2268f, -0.1169f, 0.2768f, -0.2344f)
                curveToRelative(0.0684f, -0.1703f, 0.0841f, -0.3573f, 0.0451f, -0.5366f)
                curveToRelative(-0.0323f, -0.2249f, -0.218f, -0.3964f, -0.4447f, -0.4109f)
                curveToRelative(-0.6216f, -0.0193f, -1.2433f, -0.0376f, -1.8649f, -0.0551f)
                curveToRelative(-0.8309f, -0.0244f, -1.6622f, -0.0395f, -2.4923f, -0.0788f)
                curveToRelative(-0.2157f, -0.0062f, -0.4269f, 0.0624f, -0.598f, 0.1939f)
                curveToRelative(-0.0776f, 0.0602f, -0.1398f, 0.138f, -0.1816f, 0.2268f)
                curveToRelative(-0.0306f, 0.0612f, -0.0349f, 0.1323f, -0.012f, 0.1968f)
                curveToRelative(0.0911f, 0.2059f, 0.2388f, 0.3816f, 0.426f, 0.5067f)
                curveToRelative(0.1828f, 0.1084f, 0.344f, 0.2495f, 0.4756f, 0.4164f)
                curveToRelative(0.1799f, 0.2543f, 0.3131f, 0.5385f, 0.3933f, 0.8395f)
                curveToRelative(0.0226f, 0.0742f, -0.0149f, 0.0894f, -0.0771f, 0.0893f)
                curveToRelative(-0.2363f, -5.0E-4f, -0.4727f, -0.0025f, -0.709f, 0.0015f)
                curveToRelative(-0.0776f, 0.0036f, -0.1528f, -0.0267f, -0.2063f, -0.083f)
                curveToRelative(-0.7053f, -0.6816f, -1.5531f, -0.933f, -2.5181f, -0.8194f)
                curveToRelative(-0.1283f, 0.0151f, -0.255f, 0.0436f, -0.3862f, 0.0666f)
                curveToRelative(0.0023f, -0.0186f, 0.0013f, -0.0254f, 0.0041f, -0.0298f)
                curveToRelative(0.0082f, -0.0125f, 0.0171f, -0.0245f, 0.0267f, -0.0358f)
                curveToRelative(0.1066f, -0.1275f, 0.223f, -0.2437f, 0.2825f, -0.4087f)
                curveToRelative(0.1604f, -0.4448f, -0.1299f, -0.7889f, -0.5212f, -0.8107f)
                curveToRelative(-0.3014f, -0.0168f, -0.6035f, -0.0221f, -0.9053f, -0.0321f)
                curveToRelative(-0.5439f, -0.0181f, -1.0877f, -0.0359f, -1.6315f, -0.0535f)
                curveToRelative(-0.5021f, -0.0156f, -1.0042f, -0.0335f, -1.5064f, -0.0419f)
                curveToRelative(-0.2844f, -0.0048f, -0.502f, 0.1357f, -0.6639f, 0.3599f)
                curveToRelative(-0.0829f, 0.1025f, -0.0834f, 0.2488f, -0.0013f, 0.3518f)
                curveToRelative(0.0877f, 0.1164f, 0.1826f, 0.2271f, 0.2843f, 0.3314f)
                curveToRelative(0.202f, 0.2071f, 0.4199f, 0.3993f, 0.614f, 0.6133f)
                curveToRelative(0.2367f, 0.2396f, 0.303f, 0.5993f, 0.1675f, 0.9076f)
                curveToRelative(-0.0196f, 0.0499f, -0.0328f, 0.1024f, -0.0512f, 0.1529f)
                curveToRelative(-0.2306f, 0.6339f, -0.5484f, 1.2264f, -0.8676f, 1.8181f)
                curveToRelative(-0.0096f, 0.0179f, -0.0172f, 0.0368f, -0.0257f, 0.0553f)
                lineToRelative(-0.0333f, -0.0122f)
                curveToRelative(-0.0814f, -0.1417f, -0.1688f, -0.2803f, -0.2432f, -0.4255f)
                curveToRelative(-0.2803f, -0.5469f, -0.2302f, -1.0772f, 0.091f, -1.5909f)
                curveToRelative(0.0475f, -0.076f, 0.0997f, -0.1493f, 0.1427f, -0.2277f)
                curveToRelative(0.1f, -0.1745f, 0.0744f, -0.3938f, -0.0631f, -0.5407f)
                curveToRelative(-0.1408f, -0.1748f, -0.3581f, -0.2699f, -0.582f, -0.2546f)
                curveToRelative(-0.6514f, 0.0223f, -1.3034f, 0.0276f, -1.9552f, 0.0373f)
                curveToRelative(-0.5562f, 0.0083f, -1.1125f, 0.0132f, -1.6687f, 0.0196f)
                curveToRelative(-0.2549f, 0.003f, -0.5373f, 0.2348f, -0.5633f, 0.4896f)
                curveToRelative(-0.0379f, 0.2398f, 0.068f, 0.4797f, 0.2708f, 0.6133f)
                curveToRelative(0.2738f, 0.187f, 0.5505f, 0.3708f, 0.8147f, 0.5707f)
                curveToRelative(0.2368f, 0.1696f, 0.4357f, 0.3866f, 0.5841f, 0.6372f)
                curveToRelative(0.3979f, 0.7086f, 0.7946f, 1.4179f, 1.19f, 2.128f)
                curveToRelative(0.277f, 0.4957f, 0.5523f, 0.9922f, 0.7499f, 1.5268f)
                curveToRelative(0.1663f, 0.4498f, 0.2892f, 0.9082f, 0.2105f, 1.3924f)
                curveToRelative(-0.1305f, 0.8031f, -0.5256f, 1.4364f, -1.2492f, 1.8338f)
                curveToRelative(-0.2274f, 0.1249f, -0.3183f, 0.3878f, -0.3215f, 0.6188f)
                curveToRelative(-0.0041f, 0.2927f, 0.4348f, 0.5627f, 0.6757f, 0.4978f)
                curveToRelative(0.3777f, -0.1018f, 0.7632f, -0.1744f, 1.1453f, -0.2598f)
                curveToRelative(0.9859f, -0.2205f, 1.9717f, -0.4413f, 2.9575f, -0.6624f)
                curveToRelative(0.2524f, -0.0568f, 0.4795f, -0.325f, 0.4624f, -0.569f)
                curveToRelative(-0.0078f, -0.236f, -0.1494f, -0.447f, -0.3649f, -0.5436f)
                curveToRelative(-0.2054f, -0.0957f, -0.4021f, -0.2093f, -0.5878f, -0.3394f)
                curveToRelative(-0.2645f, -0.1869f, -0.4153f, -0.496f, -0.3997f, -0.8195f)
                curveToRelative(0.008f, -0.5376f, 1.0E-4f, -1.0755f, 0.0044f, -1.6132f)
                curveToRelative(8.0E-4f, -0.0799f, 0.0181f, -0.1588f, 0.0508f, -0.2317f)
                curveToRelative(0.2879f, -0.6239f, 0.5808f, -1.2454f, 0.8725f, -1.8675f)
                curveToRelative(0.0122f, -0.0261f, 0.0265f, -0.0512f, 0.0506f, -0.0974f)
                close()
                moveTo(18.9909f, 14.5931f)
                curveToRelative(0.0f, 0.0903f, -0.0024f, 0.1764f, 4.0E-4f, 0.2623f)
                curveToRelative(0.022f, 0.6744f, 0.0456f, 1.3488f, 0.0673f, 2.0232f)
                curveToRelative(0.0051f, 0.1588f, -0.0179f, 0.1786f, -0.1789f, 0.1821f)
                curveToRelative(-0.4543f, 0.0098f, -0.909f, 0.0116f, -1.3628f, 0.0332f)
                curveToRelative(-0.4984f, 0.0238f, -0.996f, 0.0659f, -1.4939f, 0.1005f)
                curveToRelative(-0.4472f, 0.031f, -0.8944f, 0.0625f, -1.3416f, 0.0943f)
                curveToRelative(-0.2802f, 0.0203f, -0.5602f, 0.0424f, -0.8401f, 0.0663f)
                curveToRelative(-0.0696f, 0.006f, -0.1466f, 0.0093f, -0.1706f, -0.0606f)
                curveToRelative(-0.0151f, -0.0583f, -0.0059f, -0.1202f, 0.0255f, -0.1715f)
                curveToRelative(0.4157f, -0.6371f, 0.7108f, -1.3451f, 0.8707f, -2.0889f)
                curveToRelative(0.0422f, -0.1894f, 0.0634f, -0.3829f, 0.0632f, -0.577f)
                curveToRelative(0.0049f, -0.953f, 0.004f, -1.906f, -0.0027f, -2.859f)
                curveToRelative(-0.0033f, -0.5135f, -0.0196f, -1.027f, -0.0311f, -1.5405f)
                curveToRelative(-0.0032f, -0.143f, -0.0129f, -0.1503f, -0.1511f, -0.1161f)
                curveToRelative(-0.2485f, 0.0558f, -0.4862f, 0.1519f, -0.7036f, 0.2845f)
                curveToRelative(-0.069f, 0.032f, -0.1016f, 0.112f, -0.0746f, 0.1831f)
                curveToRelative(0.2187f, 0.8798f, 0.1455f, 1.8069f, -0.2088f, 2.6414f)
                curveToRelative(-0.2331f, 0.5746f, -0.6247f, 1.0711f, -1.1293f, 1.4316f)
                curveToRelative(-0.9623f, 0.6979f, -2.2806f, 0.6317f, -3.1682f, -0.1591f)
                curveToRelative(-0.6523f, -0.5623f, -1.0236f, -1.285f, -1.1791f, -2.12f)
                curveToRelative(-0.1723f, -0.8627f, -0.0614f, -1.758f, 0.3161f, -2.5527f)
                curveToRelative(0.316f, -0.6674f, 0.7779f, -1.2105f, 1.4566f, -1.5264f)
                curveToRelative(0.9797f, -0.4561f, 1.8964f, -0.3073f, 2.7392f, 0.3509f)
                curveToRelative(0.1009f, 0.0788f, 0.1867f, 0.1766f, 0.2852f, 0.259f)
                curveToRelative(0.037f, 0.0328f, 0.0835f, 0.0529f, 0.1327f, 0.0575f)
                curveToRelative(0.4846f, 0.0041f, 0.9692f, 0.0027f, 1.4539f, 0.0029f)
                curveToRelative(0.0564f, 0.0f, 0.1044f, -0.0066f, 0.0882f, -0.0837f)
                curveToRelative(-0.1126f, -0.5386f, -0.2718f, -1.0589f, -0.5939f, -1.5156f)
                curveToRelative(-0.1586f, -0.2297f, -0.3665f, -0.4212f, -0.6086f, -0.5603f)
                curveToRelative(-0.0619f, -0.0352f, -0.1303f, -0.0815f, -0.1103f, -0.1549f)
                curveToRelative(0.0195f, -0.0719f, 0.0983f, -0.0839f, 0.1724f, -0.0815f)
                curveToRelative(0.7261f, 0.0233f, 1.4523f, 0.0457f, 2.1785f, 0.0673f)
                curveToRelative(0.5201f, 0.0153f, 1.0402f, 0.0278f, 1.5603f, 0.0421f)
                curveToRelative(0.1943f, 0.0053f, 0.3885f, 0.0153f, 0.5828f, 0.0163f)
                curveToRelative(0.0748f, -0.0093f, 0.1442f, 0.0406f, 0.1592f, 0.1145f)
                curveToRelative(0.0134f, 0.0754f, -0.0453f, 0.1222f, -0.1181f, 0.1457f)
                curveToRelative(-0.3389f, 0.1033f, -0.6509f, 0.2799f, -0.9138f, 0.5174f)
                curveToRelative(-0.4137f, 0.3814f, -0.6373f, 0.8653f, -0.7588f, 1.4046f)
                curveToRelative(-0.0151f, 0.0669f, 0.0111f, 0.0878f, 0.0715f, 0.0877f)
                curveToRelative(0.0359f, -1.0E-4f, 0.0718f, 0.001f, 0.1077f, 0.0011f)
                curveToRelative(0.6851f, 0.0f, 1.3701f, -0.001f, 2.0552f, 0.0012f)
                curveToRelative(0.0805f, 0.0031f, 0.1582f, -0.0297f, 0.212f, -0.0897f)
                curveToRelative(0.3929f, -0.4216f, 0.9128f, -0.7033f, 1.4806f, -0.802f)
                curveToRelative(0.7729f, -0.1276f, 1.4603f, 0.0783f, 2.0597f, 0.5695f)
                curveToRelative(0.6898f, 0.5654f, 1.073f, 1.3137f, 1.2274f, 2.1788f)
                curveToRelative(0.1663f, 0.8548f, 0.0546f, 1.7403f, -0.3187f, 2.5271f)
                curveToRelative(-0.3389f, 0.7108f, -0.839f, 1.2729f, -1.578f, 1.5834f)
                curveToRelative(-0.7463f, 0.3136f, -1.4821f, 0.2631f, -2.1957f, -0.1177f)
                curveToRelative(-0.0342f, -0.0183f, -0.0687f, -0.036f, -0.1034f, -0.0533f)
                curveToRelative(-0.0045f, -0.0022f, -0.0115f, 3.0E-4f, -0.0305f, 0.0014f)
                close()
                moveTo(16.6603f, 15.2833f)
                verticalLineToRelative(5.0E-4f)
                curveToRelative(0.1077f, 0.0f, 0.2157f, -0.0054f, 0.323f, 0.001f)
                curveToRelative(0.3336f, 0.0198f, 0.6048f, -0.1118f, 0.8414f, -0.334f)
                curveToRelative(0.2184f, -0.2174f, 0.4076f, -0.4623f, 0.5629f, -0.7285f)
                curveToRelative(0.0455f, -0.055f, 0.0378f, -0.1365f, -0.0172f, -0.182f)
                curveToRelative(-0.0013f, -0.0011f, -0.0026f, -0.0021f, -0.004f, -0.0032f)
                curveToRelative(-0.2358f, -0.2552f, -0.4295f, -0.5461f, -0.5741f, -0.862f)
                curveToRelative(-0.3939f, -0.8477f, -0.4726f, -1.7313f, -0.2927f, -2.6422f)
                curveToRelative(0.0235f, -0.0696f, 0.002f, -0.1465f, -0.0541f, -0.194f)
                curveToRelative(-0.1091f, -0.0965f, -0.2271f, -0.1824f, -0.3524f, -0.2567f)
                curveToRelative(-0.3499f, -0.1799f, -0.7349f, -0.2218f, -1.1211f, -0.2503f)
                curveToRelative(-0.0661f, -0.0049f, -0.0827f, 0.0293f, -0.0808f, 0.0869f)
                curveToRelative(0.0145f, 0.4386f, 0.0262f, 0.8774f, 0.0426f, 1.316f)
                curveToRelative(0.0284f, 0.7578f, 0.0583f, 1.5155f, 0.0898f, 2.2732f)
                curveToRelative(0.0228f, 0.5578f, 0.0494f, 1.1155f, 0.0702f, 1.6733f)
                curveToRelative(0.003f, 0.0806f, 0.0364f, 0.1035f, 0.1088f, 0.1025f)
                curveToRelative(0.1525f, -0.0019f, 0.3051f, -6.0E-4f, 0.4577f, -6.0E-4f)
                close()
                moveTo(8.9931f, 10.3145f)
                curveToRelative(-0.0184f, 0.1807f, 0.0535f, 0.3548f, 0.1397f, 0.523f)
                curveToRelative(0.0854f, 0.1667f, 0.1893f, 0.17f, 0.2875f, 0.0078f)
                curveToRelative(0.0642f, -0.1042f, 0.1193f, -0.2138f, 0.1647f, -0.3274f)
                curveToRelative(0.1921f, -0.5105f, 0.4909f, -0.9742f, 0.8763f, -1.3601f)
                curveToRelative(0.0628f, -0.064f, 0.1191f, -0.134f, 0.168f, -0.2092f)
                curveToRelative(0.1193f, -0.1774f, 0.0707f, -0.2875f, -0.139f, -0.3331f)
                curveToRelative(-0.2465f, -0.0548f, -0.5045f, 0.0039f, -0.7031f, 0.16f)
                curveToRelative(-0.5115f, 0.3776f, -0.8038f, 0.8731f, -0.7943f, 1.539f)
                close()
                moveTo(18.3452f, 10.2034f)
                curveToRelative(-0.0017f, 0.2139f, 0.0562f, 0.424f, 0.1673f, 0.6068f)
                curveToRelative(0.0708f, 0.0993f, 0.15f, 0.1052f, 0.2245f, 0.0086f)
                curveToRelative(0.0446f, -0.0597f, 0.0831f, -0.1238f, 0.1149f, -0.1912f)
                curveToRelative(0.0576f, -0.1179f, 0.1116f, -0.2375f, 0.1623f, -0.3588f)
                curveToRelative(0.1561f, -0.3889f, 0.3849f, -0.7446f, 0.6743f, -1.0478f)
                curveToRelative(0.1021f, -0.1048f, 0.1967f, -0.2166f, 0.2832f, -0.3346f)
                curveToRelative(0.1356f, -0.1852f, 0.083f, -0.3016f, -0.1403f, -0.3474f)
                curveToRelative(-0.2564f, -0.0523f, -0.5226f, 0.0152f, -0.7231f, 0.1833f)
                curveToRelative(-0.4905f, 0.3794f, -0.7771f, 0.8663f, -0.763f, 1.481f)
                close()
                moveTo(18.0936f, 9.0844f)
                curveToRelative(-0.0335f, -0.0022f, -0.0707f, -0.0068f, -0.1079f, -0.0068f)
                curveToRelative(-0.3615f, -5.0E-4f, -0.723f, -7.0E-4f, -1.0845f, -3.0E-4f)
                curveToRelative(-0.2898f, 0.0f, -0.5796f, 0.0014f, -0.8694f, -7.0E-4f)
                curveToRelative(-0.0658f, -5.0E-4f, -0.1006f, 0.0214f, -0.1056f, 0.0893f)
                curveToRelative(-0.0067f, 0.0921f, -0.0152f, 0.1841f, -0.0257f, 0.276f)
                curveToRelative(-0.0087f, 0.0765f, 0.0232f, 0.1052f, 0.0997f, 0.1112f)
                curveToRelative(0.1754f, 0.0137f, 0.3515f, 0.0272f, 0.5248f, 0.0562f)
                curveToRelative(0.3814f, 0.0638f, 0.7438f, 0.1777f, 1.0424f, 0.44f)
                curveToRelative(0.0094f, 0.0072f, 0.0201f, 0.0127f, 0.0314f, 0.016f)
                curveToRelative(0.1655f, -0.328f, 0.3282f, -0.6506f, 0.4948f, -0.9808f)
                close()
                moveTo(13.0968f, 9.0835f)
                lineTo(13.5668f, 9.9898f)
                curveToRelative(0.0034f, 0.0013f, 0.0071f, 0.0012f, 0.0104f, -3.0E-4f)
                curveToRelative(0.2888f, -0.1702f, 0.6043f, -0.2905f, 0.9331f, -0.3556f)
                curveToRelative(0.0286f, -0.0145f, 0.0479f, -0.0426f, 0.0513f, -0.0745f)
                curveToRelative(-0.0045f, -0.1219f, -0.0225f, -0.2433f, -0.0275f, -0.3652f)
                curveToRelative(-0.0038f, -0.0927f, -0.0449f, -0.1195f, -0.1349f, -0.1186f)
                curveToRelative(-0.4004f, 0.004f, -0.8008f, 0.0016f, -1.2012f, 0.002f)
                curveToRelative(-0.0322f, 0.0f, -0.0644f, 0.0037f, -0.1012f, 0.006f)
                close()
                moveTo(5.2429f, 11.5414f)
                curveToRelative(0.0165f, -0.0184f, 0.0318f, -0.0379f, 0.0456f, -0.0584f)
                curveToRelative(0.4156f, -0.7264f, 0.8263f, -1.4559f, 1.1362f, -2.2351f)
                curveToRelative(0.0897f, -0.237f, 0.1633f, -0.4798f, 0.2204f, -0.7268f)
                curveToRelative(0.0631f, -0.2537f, -0.0123f, -0.4913f, -0.1327f, -0.7148f)
                curveToRelative(-0.1802f, -0.3346f, -0.445f, -0.5974f, -0.7276f, -0.8443f)
                curveToRelative(-0.0505f, -0.0372f, -0.098f, -0.0784f, -0.142f, -0.123f)
                curveToRelative(-0.0316f, -0.0381f, -0.0745f, -0.1087f, -0.0597f, -0.1341f)
                curveToRelative(0.0335f, -0.0469f, 0.0847f, -0.0781f, 0.1418f, -0.0864f)
                curveToRelative(0.0924f, -0.0048f, 0.1851f, -0.0026f, 0.2772f, 0.0065f)
                curveToRelative(0.4902f, 0.0148f, 0.9803f, 0.0284f, 1.4705f, 0.0438f)
                curveToRelative(0.7441f, 0.0235f, 1.4881f, 0.0478f, 2.2321f, 0.0731f)
                curveToRelative(0.0775f, 0.0027f, 0.1744f, 0.0087f, 0.1902f, 0.0993f)
                curveToRelative(0.0143f, 0.0818f, -0.0665f, 0.1222f, -0.1352f, 0.1581f)
                curveToRelative(-0.5417f, 0.2834f, -0.9623f, 0.7034f, -1.3285f, 1.1832f)
                curveToRelative(-0.46f, 0.6028f, -0.8028f, 1.2707f, -1.1049f, 1.9633f)
                curveToRelative(-0.4024f, 0.9227f, -0.8199f, 1.8388f, -1.2258f, 2.76f)
                curveToRelative(-0.0413f, 0.095f, -0.0634f, 0.1971f, -0.0652f, 0.3006f)
                curveToRelative(-0.0063f, 0.5377f, 0.0028f, 1.0755f, -0.0045f, 1.6132f)
                curveToRelative(-0.0079f, 0.578f, 0.2343f, 1.0207f, 0.7069f, 1.3402f)
                curveToRelative(0.1485f, 0.0949f, 0.3027f, 0.1806f, 0.4618f, 0.2564f)
                curveToRelative(0.0715f, 0.0363f, 0.1269f, 0.0868f, 0.1181f, 0.1613f)
                curveToRelative(-0.0084f, 0.071f, -0.0747f, 0.1064f, -0.1485f, 0.1228f)
                curveToRelative(-1.3214f, 0.295f, -2.6426f, 0.5911f, -3.9635f, 0.8881f)
                curveToRelative(-0.076f, 0.0171f, -0.1511f, 0.0067f, -0.1732f, -0.0668f)
                curveToRelative(-0.0194f, -0.0723f, 0.0157f, -0.1481f, 0.0835f, -0.1799f)
                curveToRelative(0.8117f, -0.4663f, 1.2761f, -1.1772f, 1.4547f, -2.083f)
                curveToRelative(0.091f, -0.4618f, 0.0277f, -0.9151f, -0.1081f, -1.3611f)
                curveToRelative(-0.19f, -0.5827f, -0.4421f, -1.1433f, -0.7518f, -1.6722f)
                curveToRelative(-0.4475f, -0.8007f, -0.8928f, -1.6026f, -1.3424f, -2.4021f)
                curveToRelative(-0.1927f, -0.3427f, -0.4777f, -0.6043f, -0.7868f, -0.8374f)
                curveToRelative(-0.2336f, -0.1762f, -0.4807f, -0.3344f, -0.7229f, -0.499f)
                curveToRelative(-0.1063f, -0.0722f, -0.1233f, -0.1797f, -0.031f, -0.2481f)
                curveToRelative(0.0299f, -0.0186f, 0.0645f, -0.028f, 0.0997f, -0.0272f)
                curveToRelative(0.329f, -0.0043f, 0.6581f, -0.0042f, 0.9871f, -0.0088f)
                curveToRelative(0.8851f, -0.0125f, 1.7701f, -0.0278f, 2.6552f, -0.0366f)
                curveToRelative(0.0538f, 0.0086f, 0.1024f, 0.0371f, 0.1364f, 0.0797f)
                curveToRelative(0.0143f, 0.0159f, -0.0066f, 0.0786f, -0.0276f, 0.109f)
                curveToRelative(-0.2005f, 0.2804f, -0.3362f, 0.602f, -0.3972f, 0.9413f)
                curveToRelative(-0.056f, 0.3317f, -0.0196f, 0.6723f, 0.1051f, 0.9847f)
                curveToRelative(0.1794f, 0.4648f, 0.4735f, 0.8549f, 0.8042f, 1.2206f)
                curveToRelative(0.0164f, 0.0149f, 0.034f, 0.0283f, 0.0527f, 0.0402f)
                close()
                moveTo(16.3777f, 10.3775f)
                curveToRelative(0.2142f, 0.05f, 0.42f, 0.0831f, 0.6053f, 0.1878f)
                curveToRelative(0.0493f, 0.0248f, 0.0729f, 0.0821f, 0.0553f, 0.1344f)
                curveToRelative(-0.1567f, 0.938f, -0.0145f, 1.9016f, 0.4066f, 2.7544f)
                curveToRelative(0.1192f, 0.2238f, 0.2515f, 0.4404f, 0.3963f, 0.6486f)
                curveToRelative(0.0416f, 0.0441f, 0.0433f, 0.1125f, 0.0039f, 0.1586f)
                curveToRelative(-0.1287f, 0.1947f, -0.2852f, 0.3695f, -0.4645f, 0.519f)
                curveToRelative(-0.1018f, 0.0853f, -0.2317f, 0.1296f, -0.3645f, 0.1244f)
                curveToRelative(-0.1282f, -0.0069f, -0.2571f, -0.0029f, -0.3857f, -0.0011f)
                curveToRelative(-0.0637f, 9.0E-4f, -0.0908f, -0.0248f, -0.0932f, -0.0899f)
                curveToRelative(-0.0168f, -0.4504f, -0.036f, -0.9007f, -0.0545f, -1.351f)
                curveToRelative(-0.0293f, -0.7128f, -0.0584f, -1.4255f, -0.0875f, -2.1383f)
                curveToRelative(-0.0109f, -0.2774f, -0.017f, -0.555f, -0.0243f, -0.8326f)
                curveToRelative(-9.0E-4f, -0.0343f, 0.004f, -0.0688f, 0.0069f, -0.1143f)
                close()
                moveTo(16.707f, 11.9892f)
                curveToRelative(0.0f, 0.0533f, -0.0017f, 0.0994f, 3.0E-4f, 0.1454f)
                curveToRelative(0.0108f, 0.2533f, 0.0236f, 0.5066f, 0.0337f, 0.7599f)
                curveToRelative(0.0151f, 0.3786f, 0.0276f, 0.7573f, 0.043f, 1.1359f)
                curveToRelative(0.007f, 0.1728f, 0.0199f, 0.3453f, 0.0268f, 0.5181f)
                curveToRelative(0.0023f, 0.059f, 0.0314f, 0.072f, 0.0842f, 0.0781f)
                curveToRelative(0.1507f, 0.024f, 0.3031f, -0.0316f, 0.4029f, -0.1471f)
                curveToRelative(0.0618f, -0.0689f, 0.1221f, -0.1392f, 0.1865f, -0.2056f)
                curveToRelative(0.0491f, -0.0411f, 0.0556f, -0.1143f, 0.0145f, -0.1635f)
                curveToRelative(-0.0023f, -0.0028f, -0.0048f, -0.0055f, -0.0074f, -0.008f)
                curveToRelative(-0.2606f, -0.3765f, -0.4566f, -0.7938f, -0.58f, -1.2347f)
                curveToRelative(-0.0793f, -0.2858f, -0.1354f, -0.5781f, -0.2044f, -0.8784f)
                close()
                moveTo(16.6766f, 11.245f)
                lineTo(16.6925f, 11.253f)
                curveToRelative(0.0141f, -0.1461f, 0.0299f, -0.292f, 0.0405f, -0.4383f)
                curveToRelative(0.0014f, -0.0191f, -0.0237f, -0.0402f, -0.0366f, -0.0604f)
                curveToRelative(-0.0128f, 0.0216f, -0.037f, 0.0435f, -0.0366f, 0.0648f)
                curveToRelative(0.0027f, 0.142f, 0.0106f, 0.2839f, 0.0168f, 0.4259f)
                close()
            }
        }
        .build()
        return _yolo!!
    }

private var _yolo: ImageVector? = null