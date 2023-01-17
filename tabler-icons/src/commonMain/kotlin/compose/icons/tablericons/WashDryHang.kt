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

public val TablerIcons.WashDryHang: ImageVector
    get() {
        if (_washDryHang != null) {
            return _washDryHang!!
        }
        _washDryHang = Builder(name = "WashDryHang", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                lineTo(18.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 21.0f, 6.0f)
                lineTo(21.0f, 18.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 18.0f, 21.0f)
                lineTo(6.0f, 21.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 3.0f, 18.0f)
                lineTo(3.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 6.0f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 4.01f)
                curveToRelative(5.333f, 5.323f, 10.667f, 5.32f, 16.0f, -0.01f)
            }
        }
        .build()
        return _washDryHang!!
    }

private var _washDryHang: ImageVector? = null