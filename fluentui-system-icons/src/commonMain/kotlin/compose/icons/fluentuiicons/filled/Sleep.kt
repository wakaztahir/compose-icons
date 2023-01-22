package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.Sleep: ImageVector
    get() {
        if (_sleep != null) {
            return _sleep!!
        }
        _sleep = Builder(name = "Sleep", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.3781f, 3.0258f)
                curveTo(14.7798f, 3.101f, 16.1492f, 3.5037f, 17.391f, 4.2206f)
                curveTo(21.6975f, 6.707f, 23.173f, 12.2137f, 20.6866f, 16.5202f)
                curveTo(18.2003f, 20.8267f, 12.6936f, 22.3022f, 8.3871f, 19.8158f)
                curveTo(7.2143f, 19.1387f, 6.227f, 18.2227f, 5.4751f, 17.1308f)
                curveTo(5.2236f, 16.7657f, 5.3863f, 16.2615f, 5.8036f, 16.1121f)
                curveTo(9.1952f, 14.8982f, 11.0118f, 13.4915f, 12.0659f, 11.4794f)
                curveTo(13.1756f, 9.3611f, 13.4623f, 7.0407f, 12.686f, 3.8601f)
                curveTo(12.5787f, 3.4203f, 12.9261f, 3.0016f, 13.3781f, 3.0258f)
                close()
                moveTo(10.9937f, 3.6528f)
                lineTo(11.0f, 3.7515f)
                verticalLineTo(8.9996f)
                curveTo(11.0f, 10.1041f, 10.1046f, 10.9996f, 9.0f, 10.9996f)
                curveTo(7.8954f, 10.9996f, 7.0f, 10.1041f, 7.0f, 8.9996f)
                curveTo(7.0f, 7.895f, 7.8954f, 6.9996f, 9.0f, 6.9996f)
                curveTo(9.173f, 6.9996f, 9.3409f, 7.0215f, 9.501f, 7.0628f)
                lineTo(9.5f, 4.7636f)
                lineTo(6.0f, 5.8284f)
                verticalLineTo(9.9996f)
                curveTo(6.0f, 11.1041f, 5.1046f, 11.9996f, 4.0f, 11.9996f)
                curveTo(2.8954f, 11.9996f, 2.0f, 11.1041f, 2.0f, 9.9996f)
                curveTo(2.0f, 8.895f, 2.8954f, 7.9996f, 4.0f, 7.9996f)
                curveTo(4.173f, 7.9996f, 4.3409f, 8.0215f, 4.501f, 8.0628f)
                lineTo(4.5f, 5.2726f)
                curveTo(4.5f, 4.9792f, 4.6706f, 4.7164f, 4.9303f, 4.5942f)
                lineTo(5.0317f, 4.5551f)
                lineTo(10.0317f, 3.034f)
                curveTo(10.4814f, 2.8971f, 10.9352f, 3.202f, 10.9937f, 3.6528f)
                close()
            }
        }
        .build()
        return _sleep!!
    }

private var _sleep: ImageVector? = null