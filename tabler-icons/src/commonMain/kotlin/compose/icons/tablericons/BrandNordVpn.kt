package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandNordVpn: ImageVector
    get() {
        if (_brandNordVpn != null) {
            return _brandNordVpn!!
        }
        _brandNordVpn = Builder(name = "BrandNordVpn", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.992f, 15.0f)
                lineToRelative(-2.007f, -3.0f)
                lineToRelative(-4.015f, 8.0f)
                curveToRelative(-2.212f, -3.061f, -2.625f, -7.098f, -0.915f, -10.463f)
                arcToRelative(10.14f, 10.14f, 0.0f, false, true, 8.945f, -5.537f)
                arcToRelative(10.14f, 10.14f, 0.0f, false, true, 8.945f, 5.537f)
                curveToRelative(1.71f, 3.365f, 1.297f, 7.402f, -0.915f, 10.463f)
                lineToRelative(-4.517f, -8.0f)
                lineToRelative(-1.505f, 1.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 15.0f)
                lineToRelative(-3.0f, -6.0f)
                lineToRelative(-2.5f, 4.5f)
            }
        }
        .build()
        return _brandNordVpn!!
    }

private var _brandNordVpn: ImageVector? = null
