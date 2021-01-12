package compose.icons.evaicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.evaicons.FillGroup

public val FillGroup.Shield: VectorAsset
    get() {
        if (_shield != null) {
            return _shield!!
        }
        _shield = VectorAssetBuilder(name = "Shield", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 21.85f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.0f, -0.25f)
                lineToRelative(-0.3f, -0.17f)
                arcTo(15.17f, 15.17f, 0.0f, false, true, 3.0f, 8.23f)
                verticalLineTo(8.09f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 6.34f)
                lineTo(11.0f, 2.4f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 0.0f)
                lineToRelative(7.0f, 3.94f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.0f, 1.75f)
                verticalLineToRelative(0.14f)
                arcToRelative(15.17f, 15.17f, 0.0f, false, true, -7.72f, 13.2f)
                lineToRelative(-0.3f, 0.17f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 21.85f)
                close()
            }
        }
        .build()
        return _shield!!
    }

private var _shield: VectorAsset? = null